
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[scala.xml.Elem,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: scala.xml.Elem):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(Seq[Any](/*3.2*/main("Objectified")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  <div class="row-fluid">	    
    <div class="leaderboard">
      <div class="logo">Objectified 
	    <span class="subtext">thing design & minifacturing</span>
	  </div>
      <div>"""),_display_(Seq[Any](/*9.13*/content)),format.raw/*9.20*/("""</div>
    </div>
  </div>   
""")))})),format.raw/*12.2*/("""
 
"""))}
    }
    
    def render(content:scala.xml.Elem) = apply(content)
    
    def f:((scala.xml.Elem) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 11 22:23:56 MDT 2012
                    SOURCE: /home/chill/projects/objmf/app/views/index.scala.html
                    HASH: 03636bd146e263b544be780fb8f3fbbeddf3d7f6
                    MATRIX: 513->1|615->26|652->29|679->48|718->50|937->234|965->241|1027->272
                    LINES: 19->1|22->1|24->3|24->3|24->3|30->9|30->9|33->12
                    -- GENERATED --
                */
            