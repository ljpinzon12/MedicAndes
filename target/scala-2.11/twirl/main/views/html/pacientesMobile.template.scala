
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pacientesMobile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class pacientesMobile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[PacienteEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pacientes:List[PacienteEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="A front-end template that helps you build fast, modern mobile web apps.">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
  <title>Material Design Lite</title>

  <!-- Add to homescreen for Chrome on Android -->
  <meta name="mobile-web-app-capable" content="yes">
  <link rel="icon" sizes="192x192" href="imagesM/android-desktop.png">

  <!-- Add to homescreen for Safari on iOS -->
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="apple-mobile-web-app-title" content="Material Design Lite">
  <link rel="apple-touch-icon-precomposed" href="imagesM/ios-desktop.png">

  <!-- Tile icon for Win8 (144x144 + tile color) -->
  <meta name="msapplication-TileImage" content="imagesM/touch/ms-touch-icon-144x144-precomposed.png">
  <meta name="msapplication-TileColor" content="#3372DF">

  <link rel="shortcut icon" href=""""),_display_(/*25.36*/routes/*25.42*/.Assets.versioned("imagesM/favicon.png")),format.raw/*25.82*/("""">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.cyan-light_blue.min.css">
  <link rel="stylesheet" href=""""),_display_(/*29.33*/routes/*29.39*/.Assets.versioned("cssM/styles.css")),format.raw/*29.75*/("""">
  <style>
    #view-source """),format.raw/*31.18*/("""{"""),format.raw/*31.19*/("""
      """),format.raw/*32.7*/("""position: fixed;
      display: block;
      right: 0;
      bottom: 0;
      margin-right: 40px;
      margin-bottom: 40px;
      z-index: 900;
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""
  """),format.raw/*40.3*/("""</style>
</head>
<body>
<div class="demo-layout mdl-layout mdl-js-layout mdl-layout--fixed-drawer mdl-layout--fixed-header">
  <header class="demo-header mdl-layout__header mdl-color--grey-100 mdl-color-text--grey-600">
    <div class="mdl-layout__header-row">
      <span class="mdl-layout-title">Pacientes</span>
      <div class="mdl-layout-spacer"></div>
    </div>
  </header>
  <div class="demo-drawer mdl-layout__drawer mdl-color--blue-grey-900 mdl-color-text--blue-grey-50">
    <header class="demo-drawer-header">
      <img src=""""),_display_(/*52.18*/routes/*52.24*/.Assets.versioned("imagesM/user.jpg")),format.raw/*52.61*/("""" class="demo-avatar">
      <div class="demo-avatar-dropdown">
        <span>hello#example.com</span>
        <div class="mdl-layout-spacer"></div>
        <button id="accbtn" class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
          <i class="material-icons" role="presentation">arrow_drop_down</i>
          <span class="visuallyhidden">Accounts</span>
        </button>
        <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect" for="accbtn">
          <li class="mdl-menu__item" ><i class="material-icons">remove</i><a href="/mobile" style="text-decoration: none; color:#000000;">Log out</a></li>
        </ul>
      </div>
    </header>
    <nav class="demo-navigation mdl-navigation mdl-color--blue-grey-800">
      <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">home</i>Home</a>
      <a class="mdl-navigation__link" href="citas"><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">event</i>Citas</a>
      <a class="mdl-navigation__link" href="pacientes"><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">people</i>Pacientes</a>
      <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">settings</i>Configuración</a>
      <div class="mdl-layout-spacer"></div>
      <!--<a class="mdl-navigation__link" href=""><i class="mdl-color-text&#45;&#45;blue-grey-400 material-icons" role="presentation">help_outline</i><span class="visuallyhidden">Help</span></a>-->
    </nav>
  </div>
  <main class="pacientes mdl-layout__content mdl-color--grey-100">
    <div class="mdl-grid demo-content">
      <div class="demo-cards mdl-cell mdl-cell--4-col mdl-cell--4-col-tablet mdl-grid mdl-grid--no-spacing">
        """),_display_(/*77.10*/for(pacienteActual <- pacientes) yield /*77.42*/ {_display_(Seq[Any](format.raw/*77.44*/("""
        """),format.raw/*78.9*/("""<!--Card Element-->
        <div class="demo-updates mdl-card mdl-shadow--2dp mdl-cell mdl-cell--4-col mdl-cell--4-col-tablet mdl-cell--6-col-desktop">
          <div class="mdl-card__title mdl-card--expand mdl-color--teal-300">
            <div class="mdl-card__title mdl-card--expand">
              <h4 class="patientName">
                """),_display_(/*83.18*/pacienteActual/*83.32*/.getNombre),format.raw/*83.42*/("""
              """),format.raw/*84.15*/("""</h4>
              <span class="patientState">Consejo</span>
            </div>
          </div>
          <div class="mdl-card__actions mdl-card--border">
            <a href="paciente/"""),_display_(/*89.32*/pacienteActual/*89.46*/.getId),format.raw/*89.52*/("""" class="mdl-button mdl-js-button mdl-js-ripple-effect"><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">visibility</i>Ver Paciente</a>
          </div>
        </div>
        <div class="demo-separator mdl-cell--1-col"></div>
        """)))}),format.raw/*93.10*/("""


      """),format.raw/*96.7*/("""</div>
    </div>
  </main>
</div>

<script src="https://code.getmdl.io/1.3.0/material.min.js"></script>

</body>
</html>
"""))
      }
    }
  }

  def render(pacientes:List[PacienteEntity]): play.twirl.api.HtmlFormat.Appendable = apply(pacientes)

  def f:((List[PacienteEntity]) => play.twirl.api.HtmlFormat.Appendable) = (pacientes) => apply(pacientes)

  def ref: this.type = this

}


}

/**/
object pacientesMobile extends pacientesMobile_Scope0.pacientesMobile
              /*
                  -- GENERATED --
                  DATE: Wed May 03 10:19:28 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/pacientesMobile.scala.html
                  HASH: 9b8c8ae046fb0c038108ff05ed73200831b4d6b3
                  MATRIX: 779->1|906->33|934->35|2097->1171|2112->1177|2173->1217|2570->1587|2585->1593|2642->1629|2702->1661|2731->1662|2766->1670|2949->1826|2977->1827|3008->1831|3587->2383|3602->2389|3660->2426|5558->4297|5606->4329|5646->4331|5683->4341|6059->4690|6082->4704|6113->4714|6157->4730|6377->4923|6400->4937|6427->4943|6725->5210|6764->5222
                  LINES: 27->1|32->1|33->2|56->25|56->25|56->25|60->29|60->29|60->29|62->31|62->31|63->32|70->39|70->39|71->40|83->52|83->52|83->52|108->77|108->77|108->77|109->78|114->83|114->83|114->83|115->84|120->89|120->89|120->89|124->93|127->96
                  -- GENERATED --
              */
          