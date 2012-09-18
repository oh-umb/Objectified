// @SOURCE:/home/chill/projects/objmf/conf/routes
// @HASH:b66d710e8ce39deb0333600160ea0d6a1048d7f2
// @DATE:Sun Sep 16 04:10:45 MDT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:31
class ReverseAssets {
    


 
// @LINE:31
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCommunityCentre {
    


 
// @LINE:17
def pulpit() = {
   Call("GET", "/communitycentre")
}
                                                        
 
// @LINE:16
def index() = {
   Call("GET", "/communitycentre")
}
                                                        
 
// @LINE:18
def events() = {
   Call("GET", "/communitycentre")
}
                                                        
 
// @LINE:19
def resources() = {
   Call("GET", "/communitycentre")
}
                                                        

                      
    
}
                            

// @LINE:13
class ReverseWorkShop {
    


 
// @LINE:13
def index() = {
   Call("GET", "/workshop")
}
                                                        

                      
    
}
                            

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseStudio {
    


 
// @LINE:27
def keep() = {
   Call("POST", "/studio/keep")
}
                                                        
 
// @LINE:26
def make() = {
   Call("GET", "/studio/make")
}
                                                        
 
// @LINE:25
def index() = {
   Call("GET", "/studio")
}
                                                        
 
// @LINE:28
def list() = {
   Call("GET", "/studio/list")
}
                                                        

                      
    
}
                            

// @LINE:10
class ReverseWarRoom {
    


 
// @LINE:10
def index() = {
   Call("GET", "/warroom")
}
                                                        

                      
    
}
                            

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseObjMf {
    


 
// @LINE:7
def blathe() = {
   Call("GET", "/blatherbridge")
}
                                                        
 
// @LINE:6
// @LINE:5
def index() = {
   () match {
// @LINE:5
case () if true => Call("GET", "/")
                                                                
// @LINE:6
case () if true => Call("GET", "/pitch")
                                                                    
   }
}
                                                        

                      
    
}
                            

// @LINE:22
class ReverseRoster {
    


 
// @LINE:22
def index() = {
   Call("GET", "/roster")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:31
class ReverseAssets {
    


 
// @LINE:31
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCommunityCentre {
    


 
// @LINE:17
def pulpit = JavascriptReverseRoute(
   "controllers.CommunityCentre.pulpit",
   """
      function() {
      return _wA({method:"GET", url:"/communitycentre"})
      }
   """
)
                                                        
 
// @LINE:16
def index = JavascriptReverseRoute(
   "controllers.CommunityCentre.index",
   """
      function() {
      return _wA({method:"GET", url:"/communitycentre"})
      }
   """
)
                                                        
 
// @LINE:18
def events = JavascriptReverseRoute(
   "controllers.CommunityCentre.events",
   """
      function() {
      return _wA({method:"GET", url:"/communitycentre"})
      }
   """
)
                                                        
 
// @LINE:19
def resources = JavascriptReverseRoute(
   "controllers.CommunityCentre.resources",
   """
      function() {
      return _wA({method:"GET", url:"/communitycentre"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:13
class ReverseWorkShop {
    


 
// @LINE:13
def index = JavascriptReverseRoute(
   "controllers.WorkShop.index",
   """
      function() {
      return _wA({method:"GET", url:"/workshop"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseStudio {
    


 
// @LINE:27
def keep = JavascriptReverseRoute(
   "controllers.Studio.keep",
   """
      function() {
      return _wA({method:"POST", url:"/studio/keep"})
      }
   """
)
                                                        
 
// @LINE:26
def make = JavascriptReverseRoute(
   "controllers.Studio.make",
   """
      function() {
      return _wA({method:"GET", url:"/studio/make"})
      }
   """
)
                                                        
 
// @LINE:25
def index = JavascriptReverseRoute(
   "controllers.Studio.index",
   """
      function() {
      return _wA({method:"GET", url:"/studio"})
      }
   """
)
                                                        
 
// @LINE:28
def list = JavascriptReverseRoute(
   "controllers.Studio.list",
   """
      function() {
      return _wA({method:"GET", url:"/studio/list"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:10
class ReverseWarRoom {
    


 
// @LINE:10
def index = JavascriptReverseRoute(
   "controllers.WarRoom.index",
   """
      function() {
      return _wA({method:"GET", url:"/warroom"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseObjMf {
    


 
// @LINE:7
def blathe = JavascriptReverseRoute(
   "controllers.ObjMf.blathe",
   """
      function() {
      return _wA({method:"GET", url:"/blatherbridge"})
      }
   """
)
                                                        
 
// @LINE:6
// @LINE:5
def index = JavascriptReverseRoute(
   "controllers.ObjMf.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"/"})
      }
      if (true) {
      return _wA({method:"GET", url:"/pitch"})
      }
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:22
class ReverseRoster {
    


 
// @LINE:22
def index = JavascriptReverseRoute(
   "controllers.Roster.index",
   """
      function() {
      return _wA({method:"GET", url:"/roster"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {

// @LINE:31
class ReverseAssets {
    


 
// @LINE:31
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseCommunityCentre {
    


 
// @LINE:17
def pulpit() = new play.api.mvc.HandlerRef(
   controllers.CommunityCentre.pulpit(), HandlerDef(this, "controllers.CommunityCentre", "pulpit", Seq())
)
                              
 
// @LINE:16
def index() = new play.api.mvc.HandlerRef(
   controllers.CommunityCentre.index(), HandlerDef(this, "controllers.CommunityCentre", "index", Seq())
)
                              
 
// @LINE:18
def events() = new play.api.mvc.HandlerRef(
   controllers.CommunityCentre.events(), HandlerDef(this, "controllers.CommunityCentre", "events", Seq())
)
                              
 
// @LINE:19
def resources() = new play.api.mvc.HandlerRef(
   controllers.CommunityCentre.resources(), HandlerDef(this, "controllers.CommunityCentre", "resources", Seq())
)
                              

                      
    
}
                            

// @LINE:13
class ReverseWorkShop {
    


 
// @LINE:13
def index() = new play.api.mvc.HandlerRef(
   controllers.WorkShop.index(), HandlerDef(this, "controllers.WorkShop", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseStudio {
    


 
// @LINE:27
def keep() = new play.api.mvc.HandlerRef(
   controllers.Studio.keep(), HandlerDef(this, "controllers.Studio", "keep", Seq())
)
                              
 
// @LINE:26
def make() = new play.api.mvc.HandlerRef(
   controllers.Studio.make(), HandlerDef(this, "controllers.Studio", "make", Seq())
)
                              
 
// @LINE:25
def index() = new play.api.mvc.HandlerRef(
   controllers.Studio.index(), HandlerDef(this, "controllers.Studio", "index", Seq())
)
                              
 
// @LINE:28
def list() = new play.api.mvc.HandlerRef(
   controllers.Studio.list(), HandlerDef(this, "controllers.Studio", "list", Seq())
)
                              

                      
    
}
                            

// @LINE:10
class ReverseWarRoom {
    


 
// @LINE:10
def index() = new play.api.mvc.HandlerRef(
   controllers.WarRoom.index(), HandlerDef(this, "controllers.WarRoom", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseObjMf {
    


 
// @LINE:7
def blathe() = new play.api.mvc.HandlerRef(
   controllers.ObjMf.blathe(), HandlerDef(this, "controllers.ObjMf", "blathe", Seq())
)
                              
 
// @LINE:5
def index() = new play.api.mvc.HandlerRef(
   controllers.ObjMf.index(), HandlerDef(this, "controllers.ObjMf", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:22
class ReverseRoster {
    


 
// @LINE:22
def index() = new play.api.mvc.HandlerRef(
   controllers.Roster.index(), HandlerDef(this, "controllers.Roster", "index", Seq())
)
                              

                      
    
}
                            
}
                    
                