enablePlugins(ScalaJSPlugin)

scalaVersion := "2.12.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"
libraryDependencies += "com.github.karasiq" %%% "scalajs-bootstrap-v4" % "2.3.5"

skip in packageJSDependencies := false
jsDependencies += "org.webjars" % "jquery" % "2.2.4" / "jquery.js" minified "jquery.min.js"

mainClass in Compile := Some("com.karasiq.bootstrap4.test.frontend.BootstrapTestApp")
scalaJSUseMainModuleInitializer := true

// what is this?
scalaJSModuleKind := ModuleKind.CommonJSModule
