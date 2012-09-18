
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
  <head>
    <title>"""),_display_(Seq[Any](/*7.13*/title)),format.raw/*7.18*/("""</title>
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*8.35*/routes/*8.41*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*8.82*/("""">
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*9.35*/routes/*9.41*/.Assets.at("bootstrap/css/fluid-layout.css"))),format.raw/*9.85*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.55*/routes/*10.61*/.Assets.at("images/favicon.png"))),format.raw/*10.93*/("""">
    <script src=""""),_display_(Seq[Any](/*11.19*/routes/*11.25*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.70*/("""" type="text/javascript"></script>
  </head>
  <body>
	<div class="container-fluid">
      """),_display_(Seq[Any](/*15.8*/content)),format.raw/*15.15*/("""
    </div>
    <div class="nav pull-right navbar-fixed-bottom">
      <a href="/pitch">pitch</a> - 
      <a href="/warroom">fishing for niches</a> - 
      <a href="/workshop">products and services</a> -
      <a href="/communitycentre">initiatives, events, and resources</a> - 
	  <a href="/roster">roster and makesmanship</a> -
	  <a href="/studio">eye candy</a> - 
	  <a href="/blatherbridge">blather bridge</a> - 
	  
	</div>
  </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Sep 16 04:10:45 MDT 2012
                    SOURCE: /home/chill/projects/objmf/app/views/main.scala.html
                    HASH: aa132b536d23dea4c56abfab27fa9afe3f8cf11b
                    MATRIX: 509->1|616->31|698->78|724->83|802->126|816->132|878->173|950->210|964->216|1029->260|1122->317|1137->323|1191->355|1248->376|1263->382|1330->427|1457->519|1486->526
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|36->15|36->15
                    -- GENERATED --
                */
            