
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
            <!-- start: Meta -->
        <meta charset="utf-8">
        <title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>


    </head>
    <body>


            """),_display_(/*21.14*/content),format.raw/*21.21*/("""







    """),format.raw/*29.5*/("""</body>

</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon May 01 22:46:29 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/main.scala.html
                  HASH: 04716bf6c928f25de6c0871f4c384ce0a6c1f3e8
                  MATRIX: 1007->266|1132->296|1162->300|1318->429|1344->434|1427->490|1455->497|1502->517
                  LINES: 32->7|37->7|39->9|44->14|44->14|51->21|51->21|59->29
                  -- GENERATED --
              */
          