enablePlugins(ScalaJSBundlerPlugin)

scalaVersion := "2.12.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"
libraryDependencies += "com.github.karasiq" %%% "scalajs-bootstrap-v4" % "2.3.5"

npmDependencies in Compile += "jquery" -> "2.2.4"
npmDependencies in Compile += "bootstrap" -> "4.3.1"

mainClass in Compile := Some("com.karasiq.bootstrap4.test.frontend.BootstrapTestApp")
scalaJSUseMainModuleInitializer := true
