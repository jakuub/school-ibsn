
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
<html>
	<head>
		<style>
			a """),format.raw("""{"""),format.raw/*5.7*/("""
				display: block;
				padding: 10px;
				margin: 20px auto;
				width: 100px;
				text-align: center;
				background-color: eaeaea;
				border: 1px #555;
				color: #666;
				text-decoration: none;
				text-transform: capitalize;
			"""),format.raw("""}"""),format.raw/*16.5*/("""
		</style>
	</head>
	<body>
		<a href=""""),_display_(Seq[Any](/*20.13*/routes/*20.19*/.Application.index)),format.raw/*20.37*/("""">home</a>
		<a href=""""),_display_(Seq[Any](/*21.13*/routes/*21.19*/.Application.action1)),format.raw/*21.39*/("""">link 1</a>
		<a href=""""),_display_(Seq[Any](/*22.13*/routes/*22.19*/.Application.action2)),format.raw/*22.39*/("""">link 2</a>
	</body>
</html>
"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 15 13:06:57 CEST 2013
                    SOURCE: /home/jakuub/Documents/skola/rocnik2/itbsn/project/project/app/views/index.scala.html
                    HASH: b40837dcc901d0f8e137e9752af86d797f8d7bae
                    MATRIX: 505->1|599->18|676->50|959->287|1036->328|1051->334|1091->352|1150->375|1165->381|1207->401|1268->426|1283->432|1325->452
                    LINES: 19->1|22->1|26->5|37->16|41->20|41->20|41->20|42->21|42->21|42->21|43->22|43->22|43->22
                    -- GENERATED --
                */
            