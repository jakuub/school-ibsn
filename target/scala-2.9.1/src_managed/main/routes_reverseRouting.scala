// @SOURCE:/home/jakuub/Documents/skola/rocnik2/itbsn/project/project/conf/routes
// @HASH:6cc2522c3a0043fbe224324f37dbd51f1ce2f066
// @DATE:Tue Oct 15 12:59:19 CEST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def action1() = {
   Call("GET", "/action1")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:8
def action2() = {
   Call("GET", "/action2")
}
                                                        

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def action1 = JavascriptReverseRoute(
   "controllers.Application.action1",
   """
      function() {
      return _wA({method:"GET", url:"/action1"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:8
def action2 = JavascriptReverseRoute(
   "controllers.Application.action2",
   """
      function() {
      return _wA({method:"GET", url:"/action2"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:7
def action1() = new play.api.mvc.HandlerRef(
   controllers.Application.action1(), HandlerDef(this, "controllers.Application", "action1", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:8
def action2() = new play.api.mvc.HandlerRef(
   controllers.Application.action2(), HandlerDef(this, "controllers.Application", "action2", Seq())
)
                              

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                