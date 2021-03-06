package models;

/**
 * Clase que representa un paciente
 * Created by ln.bello10 on 10/02/2017.
 */
import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="pacienteEntity")
public class PacienteEntity extends Model {
    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long, PacienteEntity> FINDER = new Finder<>(PacienteEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador del paciente
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Paciente
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Paciente")
    private Long id;

    /**
     * nombre del paciente
     */
    private String nombre;

    /**
     * grupo sanguineo del paciente
     */
    private String grupoSanguineo;
    /**
     * lista de medicos del paciente
     */
    //
    @ManyToMany
    @JsonBackReference
    private List<MedicoEntity> medicos;
    /**
     * lista de consejos del medico para el paciente
     */

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference(value = "r2")
    private List<ConsejoEntity> consejosRecibidos;
    /**
     * marcapasos del paciente
     */

    @OneToOne
    private MarcapasosEntity marcapasos;

    /**
     * citas del paciente
     */
    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference(value = "r5")
    private List<CitaEntity> citas;

    /**
     * examenes del paciente
     */
    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference(value="r7")
    private List<ExamenEntity> examenes;

    /**
     * historial del paciente
     */
    @OneToOne
    private HistorialEntity historialPaciente;


    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public PacienteEntity() {

        id = null;
        nombre = "NO NAME";
        grupoSanguineo = "NO NAME";
        medicos = new ArrayList<MedicoEntity>();
        consejosRecibidos = new ArrayList<ConsejoEntity>();
        marcapasos = null;
        //lecturas = new ArrayList<LecturaEntity>();
        citas = new ArrayList<CitaEntity>();
        //examenes = new ArrayList<ExamenEntity>();
        historialPaciente = null;
    }

    /**
     * Constructor con todos los atributos de la clase.
     *
     * @param id
     * @param nombre
     * @param grupoSanguineo
     */

    public PacienteEntity(Long id, String nombre, String grupoSanguineo) {

        this.id = id;
        this.nombre = nombre;
        this.grupoSanguineo = grupoSanguineo;
    }

    public PacienteEntity(Long id) {
        this();
        setId(id);
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getGrupoSanguineo() {

        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {

        this.grupoSanguineo = grupoSanguineo;
    }

    public MarcapasosEntity getMarcapasos() {

        return marcapasos;
    }

    public void setMarcapasos(MarcapasosEntity marcapasos) {

        this.marcapasos = marcapasos;
    }

    public HistorialEntity getHistorialPaciente() {

        return historialPaciente;
    }

    public void setHistorialPaciente(HistorialEntity historial) {

        this.historialPaciente = historial;
    }

    public List<CitaEntity> getCitas() {

        return citas;
    }

    public void setCitas(List<CitaEntity> citas) {

        this.citas = citas;
    }

    public void addCita(CitaEntity cita) {

        this.citas.add(cita);
    }

    public void addConsejo(ConsejoEntity consejo) {

        this.consejosRecibidos.add(consejo);
    }

    //    public List<LecturaEntity> getLecturas() {
//
//        return lecturas;
//    }
//
//    public void setLecturas(List <LecturaEntity> lecturas) {
//
//        this.lecturas = lecturas;
//    }
    public List<MedicoEntity> getMedicos() {

        return medicos;
    }

    public void setMedicos(List<MedicoEntity> medico) {

        this.medicos = medicos;
    }

    public List<ConsejoEntity> getConsejos() {

        return consejosRecibidos;
    }

    public void setConsejosRecibidos(List<ConsejoEntity> consejos) {

        this.consejosRecibidos = consejos;
    }

    public List<LecturaEntity> getLecturasHistorialEnPeriodoDeTiempo(Long inicio, Long fin) {

        List<LecturaEntity> lecturasRecorrer = historialPaciente.getLecturasHistorial();
        List<LecturaEntity> lecturasRespuesta = new ArrayList<LecturaEntity>();

        for (int i = 0; i < lecturasRecorrer.size(); i++) {

            LecturaEntity actual = lecturasRecorrer.get(i);

            if (actual.getFecha() > inicio && actual.getFecha() < fin) {

                lecturasRespuesta.add(actual);
            }

        }
        return lecturasRespuesta;


    }
}
