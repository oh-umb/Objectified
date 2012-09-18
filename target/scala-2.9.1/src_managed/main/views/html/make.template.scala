
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
object make extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(imgForm: Form[(String)]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("Make a Thing")/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
   
  <div>
    """),_display_(Seq[Any](/*9.6*/form(action = routes.Studio.keep, args = 'class -> "form-horizontal")/*9.75*/ {_display_(Seq[Any](format.raw/*9.77*/("""
      <fieldset>
	    <legend> &nbsp; Make a Thing</legend>
        <div class="control-group">
	      <label class="control-label" for="label">Label</label>
	      <div class="controls">
		    <input type="text" class="input-xlarge" id="label" name="label">
		  </div>
        </div>

        <div class="form-actions">
	      <button type="submit" class="btn btn-primary">Make</button>
	    </div>
	  </fieldset>	
    """)))})),format.raw/*23.6*/("""
  </div>
""")))})),format.raw/*25.2*/("""
"""))}
    }
    
    def render(imgForm:Form[String]) = apply(imgForm)
    
    def f:((Form[String]) => play.api.templates.Html) = (imgForm) => apply(imgForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 11 22:23:56 MDT 2012
                    SOURCE: /home/chill/projects/objmf/app/views/make.scala.html
                    HASH: 14a47e383ecede3e1ea73dad106de5d038643d21
                    MATRIX: 510->1|662->26|690->79|726->81|754->101|793->103|845->121|922->190|961->192|1414->614|1456->625
                    LINES: 19->1|25->1|27->5|28->6|28->6|28->6|31->9|31->9|31->9|45->23|47->25
                    -- GENERATED --
                */
            