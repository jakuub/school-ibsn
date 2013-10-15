// @SOURCE:/home/jakuub/Documents/skola/rocnik2/itbsn/project/project/conf/routes
// @HASH:6cc2522c3a0043fbe224324f37dbd51f1ce2f066
// @DATE:Tue Oct 15 12:59:19 CEST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_action11 = Route("GET", PathPattern(List(StaticPart("/action1"))))
                    

// @LINE:8
val controllers_Application_action22 = Route("GET", PathPattern(List(StaticPart("/action2"))))
                    

// @LINE:11
val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/action1""","""controllers.Application.action1"""),("""GET""","""/action2""","""controllers.Application.action2"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_action11(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.action1, HandlerDef(this, "controllers.Application", "action1", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_action22(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.action2, HandlerDef(this, "controllers.Application", "action2", Nil))
   }
}
                    

// @LINE:11
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                