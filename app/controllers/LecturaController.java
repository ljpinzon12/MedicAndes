package controllers;

import akka.dispatch.MessageDispatcher;
import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Query;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.HistorialEntity;
import models.LecturaEntity;
import models.PacienteEntity;
import models.*;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static com.avaje.ebean.Expr.eq;
import static play.libs.Json.toJson;


/**
 * Created by Lady Pinzon on 11/02/2017.
 */
public class LecturaController extends Controller {

    public CompletionStage<Result> getLecturas()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return LecturaEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(lecturaEntities -> {return ok(toJson(lecturaEntities));}
                );
    }

    public CompletionStage<Result> getLectura(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return LecturaEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(lecturas -> {return ok(toJson(lecturas));}
                );
    }

    public CompletionStage<Result> createLectura()
    {

        JsonNode n = request().body().asJson();

        LecturaEntity lectura = Json.fromJson( n , LecturaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    lectura.save();
                    return lectura;
                }
        ).thenApply(
                lecturas -> {
                    return ok(Json.toJson(lecturas));
                }
        );
    }

    public CompletionStage<Result> deleteLectura(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    LecturaEntity lectura = LecturaEntity.FINDER.byId(idE);
                    lectura.delete();
                    return lectura;
                }
        ).thenApply(
                lecturas -> {
                    return ok(Json.toJson(lecturas));
                }
        );
    }
    public CompletionStage<Result> updateLectura( Long idE)
    {

        JsonNode n = request().body().asJson();
        LecturaEntity m = Json.fromJson( n , LecturaEntity.class ) ;
        LecturaEntity antiguo = LecturaEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setFecha(m.getFecha());
                    antiguo.setFrecuenciaCardiaca(m.getFrecuenciaCardiaca());
                    antiguo.setPresionSanguinea(m.getPresionSanguinea());
                    antiguo.setNivelEstres(m.getNivelEstres());
                    antiguo.setEstado(m.getEstado());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                lecturas -> {
                    return ok(Json.toJson(lecturas));
                }
        );
    }


    public CompletionStage<Result> createLecturaPaciente(Long idPaciente){

        JsonNode n = request().body().asJson();

        LecturaEntity lectura = Json.fromJson( n , LecturaEntity.class ) ;


        return CompletableFuture.supplyAsync(
                ()->{
                    PacienteEntity paciente = PacienteEntity.FINDER.byId(idPaciente);
                    //lectura.setPaciente(paciente);
                    lectura.setHistorial(paciente.getHistorialPaciente());

                    paciente.getHistorialPaciente().addLectura(lectura);
                    lectura.save();

                    lectura.setEstado(LecturaEntity.ESTADO_VERDE);

                    MedicoObserver medOb = new MedicoObserver(lectura);
                    EmergenciaObserver emerOb = new EmergenciaObserver(lectura);

                    lectura.agregarObservador(medOb);
                    lectura.agregarObservador(emerOb);

                    EstadoRojo estadoRojo = new EstadoRojo();
                    if(!estadoRojo.manejar(lectura))
                    {
                        EstadoAmarillo estadoAmarillo = new EstadoAmarillo();
                        estadoAmarillo.manejar(lectura);
                    }

                    lectura.update();
                    paciente.getHistorialPaciente().update();
                    return lectura;
                }
        ).thenApply(
                lecturas -> {
                    return ok(Json.toJson(lecturas));
                }
        );
    }



    public CompletionStage<Result> createLecturaCifrada(Long idPaciente){

        JsonNode n = request().body().asJson();
        String j = n.toString();
 //      EncriptadoEntity lectura = new EncriptadoEntity(j);
 //      System.out.println(lectura.getMensajeCodificado());
   EncriptadoEntity lectura = Json.fromJson( n , EncriptadoEntity.class ) ;

        if(lectura.validar()) {
            String mensaje = lectura.getMensajeDesencriptado();
            JsonNode json = Json.parse(mensaje);
            LecturaEntity lecturaDesencriptada = Json.fromJson(json, LecturaEntity.class);



            return CompletableFuture.supplyAsync(
                    () -> {
                        PacienteEntity paciente = PacienteEntity.FINDER.byId(idPaciente);
                        //lectura.setPaciente(paciente);
                        lecturaDesencriptada.setHistorial(paciente.getHistorialPaciente());

                        paciente.getHistorialPaciente().addLectura(lecturaDesencriptada);
                        lecturaDesencriptada.save();

                        lecturaDesencriptada.setEstado(LecturaEntity.ESTADO_VERDE);
                        MedicoObserver medOb = new MedicoObserver(lecturaDesencriptada);
                        EmergenciaObserver emerOb = new EmergenciaObserver(lecturaDesencriptada);

                        lecturaDesencriptada.agregarObservador(medOb);
                        lecturaDesencriptada.agregarObservador(emerOb);

                        EstadoRojo estadoRojo = new EstadoRojo();
                        if(!estadoRojo.manejar(lecturaDesencriptada))
                        {
                            EstadoAmarillo estadoAmarillo = new EstadoAmarillo();
                            estadoAmarillo.manejar(lecturaDesencriptada);
                        }

                        lecturaDesencriptada.update();
                        paciente.getHistorialPaciente().update();
                        return lecturaDesencriptada;
                    }
            ).thenApply(
                    lecturas -> {
                        return ok(Json.toJson(lecturas));
                    }
            );
        }
        else
        {
            return CompletableFuture.supplyAsync(
                    () ->
                    {
                        return "Error con integridad";
                    }
            ).thenApply(
                    lecturas ->
                    {
                        return ok(Json.toJson(lecturas));
                    }
            );
        }
    }

    public static List<LecturaEntity> getLecturasRecientes(Long idHistorial)
    {
        Query<LecturaEntity> find = LecturaEntity.FINDER.query();
        ExpressionList<LecturaEntity> myQuery = find.where();

        if (idHistorial != null) myQuery.add(eq("historial_id", idHistorial));
        myQuery.orderBy("fecha desc");

        List<LecturaEntity> queryResult = myQuery.findList();
        List<LecturaEntity> rta = new ArrayList<LecturaEntity>();

        for(int i = 0; i < 15 && i<queryResult.size();i++){
            rta.add(queryResult.get(i));
        }
        return rta;
    }
}
