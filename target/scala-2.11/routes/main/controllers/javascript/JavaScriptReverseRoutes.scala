
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Camilo/Documents/GitHub/MedicAndes/conf/routes
// @DATE:Thu May 11 13:35:04 COT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:16
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:31
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseMobileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def mensajes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MobileController.mensajes",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/mensajes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:39
    def mobileLPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MobileController.mobileLPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/mpaciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:35
    def mobileCitas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MobileController.mobileCitas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/citas"})
        }
      """
    )
  
    // @LINE:34
    def mobilePacientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MobileController.mobilePacientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/pacientes"})
        }
      """
    )
  
    // @LINE:37
    def mobileIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MobileController.mobileIndex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile"})
        }
      """
    )
  
    // @LINE:36
    def mobilePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MobileController.mobilePaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mobile/paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:77
  class ReverseMarcapasosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:80
    def updateMarcapasos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarcapasosController.updateMarcapasos",
      """
        function(idP0,idM1,tk2) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "marcapasos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0) + "&" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idM", idM1) + "/tk=" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tk", encodeURIComponent(tk2))})
        }
      """
    )
  
    // @LINE:82
    def updateMarcapasos2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarcapasosController.updateMarcapasos2",
      """
        function(idP0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "marcapasos2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0)})
        }
      """
    )
  
    // @LINE:77
    def createMarcapasosPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarcapasosController.createMarcapasosPaciente",
      """
        function(idP0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "marcapasos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0)})
        }
      """
    )
  
  }

  // @LINE:24
  class ReversePacienteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def deletePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.deletePaciente",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:53
    def updatePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.updatePaciente",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
          }
        
        }
      """
    )
  
    // @LINE:49
    def getPacientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPacientes",
      """
        function(tk0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pacientes/tk=" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tk", encodeURIComponent(tk0))})
        }
      """
    )
  
    // @LINE:55
    def getPacientes2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPacientes2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pacientes"})
        }
      """
    )
  
    // @LINE:24
    def enviarMensajePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.enviarMensajePaciente",
      """
        function(idM0,idP1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mensajes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idM", idM0) + "&" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP1)})
        }
      """
    )
  
    // @LINE:52
    def createPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.createPaciente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente"})
        }
      """
    )
  
    // @LINE:50
    def getPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPaciente",
      """
        function(id0,tk1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/tk=" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tk", encodeURIComponent(tk1))})
        }
      """
    )
  
  }

  // @LINE:84
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def mensajes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.mensajes",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app/mensajes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:18
    def pacientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.pacientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app/pacientes"})
        }
      """
    )
  
    // @LINE:21
    def historial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.historial",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app/historial/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:19
    def citas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.citas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app/citas"})
        }
      """
    )
  
    // @LINE:17
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app/home"})
        }
      """
    )
  
    // @LINE:22
    def marcapasos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.marcapasos",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "app/marcapasos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:16
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseCitaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def createCitaPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.createCitaPaciente",
      """
        function(idP0,idM1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cita/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0) + "&" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idM", idM1)})
        }
      """
    )
  
    // @LINE:64
    def getLecturasPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getLecturasPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/lecturas"})
        }
      """
    )
  
    // @LINE:69
    def createCita: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.createCita",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cita"})
        }
      """
    )
  
    // @LINE:65
    def getEmergenciasPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getEmergenciasPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/emergencias"})
        }
      """
    )
  
    // @LINE:63
    def getExamenesPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getExamenesPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/examenes"})
        }
      """
    )
  
    // @LINE:51
    def getLecturasRango: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getLecturasRango",
      """
        function(id0,inicio1,fin2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/historialRangoFechas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("inicio", encodeURIComponent(inicio1)) + "&" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("fin", encodeURIComponent(fin2))})
        }
      """
    )
  
    // @LINE:67
    def getMarcapasosPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getMarcapasosPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/marcapasos"})
        }
      """
    )
  
    // @LINE:60
    def getCita: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getCita",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cita" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:62
    def getHistorialPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getHistorialPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/historial"})
        }
      """
    )
  
    // @LINE:70
    def updateCita: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.updateCita",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "cita/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:66
    def getConsejosPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getConsejosPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/consejos"})
        }
      """
    )
  
    // @LINE:59
    def getCitas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getCitas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "citas"})
        }
      """
    )
  
    // @LINE:61
    def getCitasPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getCitasPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/citas"})
        }
      """
    )
  
    // @LINE:20
    def createCita2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.createCita2",
      """
        function(idPaciente0,idMedico1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "app/agendarCita/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idPaciente", idPaciente0) + "&" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idMedico", idMedico1)})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:75
  class ReverseEmergenciaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def createEmergenciaPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmergenciaController.createEmergenciaPaciente",
      """
        function(idP0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "emergencia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0)})
        }
      """
    )
  
  }

  // @LINE:79
  class ReverseHistorialController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:79
    def updateHistorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HistorialController.updateHistorial",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "historial/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:56
  class ReverseConsejoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def getConsejos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.getConsejos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consejos/"})
        }
      """
    )
  
    // @LINE:76
    def createConsejoPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.createConsejoPaciente",
      """
        function(idP0,idM1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0) + "&" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idM", idM1)})
        }
      """
    )
  
    // @LINE:57
    def createConsejo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.createConsejo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "consejos/crear"})
        }
      """
    )
  
  }

  // @LINE:73
  class ReverseLecturaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def createLecturaCifrada: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LecturaController.createLecturaCifrada",
      """
        function(idP0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lectura/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0)})
        }
      """
    )
  
    // @LINE:74
    def createLecturaPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LecturaController.createLecturaPaciente",
      """
        function(idP0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lecturaPruebas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0)})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseMedicoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def getMedicos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedicos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medicos"})
        }
      """
    )
  
    // @LINE:46
    def updateMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.updateMedico",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:44
    def getMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedico",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:45
    def createMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.createMedico",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medico"})
        }
      """
    )
  
  }


}
