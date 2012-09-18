
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
object studio extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.api.data.Form[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: play.api.data.Form[String]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""
 
"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.0")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
   <div class="row-fluid">	    
      <div class="leaderboard">
         <div class="logo">Objectified 
	        <span class="subtext">thing design & minifacturing</span>
	     </div>
         <div>
             <h3>Welcome to our  Studio. Not much to speak of at the moment but it will get better</h3>
            <script src=""""),_display_(Seq[Any](/*11.27*/routes/*11.33*/.Assets.at("javascripts/index.js"))),format.raw/*11.67*/("""" type="text/javascript"></script>
            <ul id="things"></ul>
            <a href="studio/make">Make a Thing</a>
        </div>
     </div>  
""")))})))}
    }
    
    def render(form:play.api.data.Form[String]) = apply(form)
    
    def f:((play.api.data.Form[String]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 11 22:23:56 MDT 2012
                    SOURCE: /home/chill/projects/objmf/app/views/studio.scala.html
                    HASH: 915e21277de22ccf5494823fa4a1841e23035350
                    MATRIX: 526->1|637->35|675->39|710->66|749->68|1115->398|1130->404|1186->438
                    LINES: 19->1|22->1|24->3|24->3|24->3|32->11|32->11|32->11
                    -- GENERATED --
                */
            