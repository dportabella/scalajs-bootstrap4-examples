enablePlugins(ScalaJSBundlerPlugin)

scalaVersion := "2.12.6"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"
libraryDependencies += "com.github.karasiq" %%% "scalajs-bootstrap-v4" % "2.3.5"

npmDependencies in Compile += "jquery" -> "3.2.1"
npmDependencies in Compile += "bootstrap" -> "4.1.1"

mainClass in Compile := Some("com.karasiq.bootstrap4.test.frontend.BootstrapTestApp")
scalaJSUseMainModuleInitializer := true

scalaJSModuleKind := ModuleKind.CommonJSModule
version in webpack := "4.28.4"
emitSourceMaps := false
