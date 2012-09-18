// @SOURCE:/home/chill/projects/objmf/conf/routes
// @HASH:b66d710e8ce39deb0333600160ea0d6a1048d7f2
// @DATE:Sun Sep 16 04:10:45 MDT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:5
val controllers_ObjMf_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:6
val controllers_ObjMf_index1 = Route("GET", PathPattern(List(StaticPart("/pitch"))))
                    

// @LINE:7
val controllers_ObjMf_blathe2 = Route("GET", PathPattern(List(StaticPart("/blatherbridge"))))
                    

// @LINE:10
val controllers_WarRoom_index3 = Route("GET", PathPattern(List(StaticPart("/warroom"))))
                    

// @LINE:13
val controllers_WorkShop_index4 = Route("GET", PathPattern(List(StaticPart("/workshop"))))
                    

// @LINE:16
val controllers_CommunityCentre_index5 = Route("GET", PathPattern(List(StaticPart("/communitycentre"))))
                    

// @LINE:17
val controllers_CommunityCentre_pulpit6 = Route("GET", PathPattern(List(StaticPart("/communitycentre"))))
                    

// @LINE:18
val controllers_CommunityCentre_events7 = Route("GET", PathPattern(List(StaticPart("/communitycentre"))))
                    

// @LINE:19
val controllers_CommunityCentre_resources8 = Route("GET", PathPattern(List(StaticPart("/communitycentre"))))
                    

// @LINE:22
val controllers_Roster_index9 = Route("GET", PathPattern(List(StaticPart("/roster"))))
                    

// @LINE:25
val controllers_Studio_index10 = Route("GET", PathPattern(List(StaticPart("/studio"))))
                    

// @LINE:26
val controllers_Studio_make11 = Route("GET", PathPattern(List(StaticPart("/studio/make"))))
                    

// @LINE:27
val controllers_Studio_keep12 = Route("POST", PathPattern(List(StaticPart("/studio/keep"))))
                    

// @LINE:28
val controllers_Studio_list13 = Route("GET", PathPattern(List(StaticPart("/studio/list"))))
                    

// @LINE:31
val controllers_Assets_at14 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.ObjMf.index"""),("""GET""","""/pitch""","""controllers.ObjMf.index"""),("""GET""","""/blatherbridge""","""controllers.ObjMf.blathe"""),("""GET""","""/warroom""","""controllers.WarRoom.index"""),("""GET""","""/workshop""","""controllers.WorkShop.index"""),("""GET""","""/communitycentre""","""controllers.CommunityCentre.index"""),("""GET""","""/communitycentre""","""controllers.CommunityCentre.pulpit"""),("""GET""","""/communitycentre""","""controllers.CommunityCentre.events"""),("""GET""","""/communitycentre""","""controllers.CommunityCentre.resources"""),("""GET""","""/roster""","""controllers.Roster.index"""),("""GET""","""/studio""","""controllers.Studio.index"""),("""GET""","""/studio/make""","""controllers.Studio.make"""),("""POST""","""/studio/keep""","""controllers.Studio.keep"""),("""GET""","""/studio/list""","""controllers.Studio.list"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:5
case controllers_ObjMf_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.ObjMf.index, HandlerDef(this, "controllers.ObjMf", "index", Nil))
   }
}
                    

// @LINE:6
case controllers_ObjMf_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.ObjMf.index, HandlerDef(this, "controllers.ObjMf", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_ObjMf_blathe2(params) => {
   call { 
        invokeHandler(_root_.controllers.ObjMf.blathe, HandlerDef(this, "controllers.ObjMf", "blathe", Nil))
   }
}
                    

// @LINE:10
case controllers_WarRoom_index3(params) => {
   call { 
        invokeHandler(_root_.controllers.WarRoom.index, HandlerDef(this, "controllers.WarRoom", "index", Nil))
   }
}
                    

// @LINE:13
case controllers_WorkShop_index4(params) => {
   call { 
        invokeHandler(_root_.controllers.WorkShop.index, HandlerDef(this, "controllers.WorkShop", "index", Nil))
   }
}
                    

// @LINE:16
case controllers_CommunityCentre_index5(params) => {
   call { 
        invokeHandler(_root_.controllers.CommunityCentre.index, HandlerDef(this, "controllers.CommunityCentre", "index", Nil))
   }
}
                    

// @LINE:17
case controllers_CommunityCentre_pulpit6(params) => {
   call { 
        invokeHandler(_root_.controllers.CommunityCentre.pulpit, HandlerDef(this, "controllers.CommunityCentre", "pulpit", Nil))
   }
}
                    

// @LINE:18
case controllers_CommunityCentre_events7(params) => {
   call { 
        invokeHandler(_root_.controllers.CommunityCentre.events, HandlerDef(this, "controllers.CommunityCentre", "events", Nil))
   }
}
                    

// @LINE:19
case controllers_CommunityCentre_resources8(params) => {
   call { 
        invokeHandler(_root_.controllers.CommunityCentre.resources, HandlerDef(this, "controllers.CommunityCentre", "resources", Nil))
   }
}
                    

// @LINE:22
case controllers_Roster_index9(params) => {
   call { 
        invokeHandler(_root_.controllers.Roster.index, HandlerDef(this, "controllers.Roster", "index", Nil))
   }
}
                    

// @LINE:25
case controllers_Studio_index10(params) => {
   call { 
        invokeHandler(_root_.controllers.Studio.index, HandlerDef(this, "controllers.Studio", "index", Nil))
   }
}
                    

// @LINE:26
case controllers_Studio_make11(params) => {
   call { 
        invokeHandler(_root_.controllers.Studio.make, HandlerDef(this, "controllers.Studio", "make", Nil))
   }
}
                    

// @LINE:27
case controllers_Studio_keep12(params) => {
   call { 
        invokeHandler(_root_.controllers.Studio.keep, HandlerDef(this, "controllers.Studio", "keep", Nil))
   }
}
                    

// @LINE:28
case controllers_Studio_list13(params) => {
   call { 
        invokeHandler(_root_.controllers.Studio.list, HandlerDef(this, "controllers.Studio", "list", Nil))
   }
}
                    

// @LINE:31
case controllers_Assets_at14(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                