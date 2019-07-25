enablePlugins(ScalaJSBundlerPlugin)

scalaVersion := "2.12.6"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"
libraryDependencies += "com.github.karasiq" %%% "scalajs-bootstrap-v4" % "2.3.5"

npmDependencies in Compile += "jquery" -> "3.2.1"
npmDependencies in Compile += "bootstrap" -> "4.1.1"

mainClass in Compile := Some("com.karasiq.bootstrap4.test.frontend.BootstrapTestApp")
scalaJSUseMainModuleInitializer := true


// [error] npm ERR! notarget No matching version found for bootstrap@4.3.1 ~4.1.1
// [error] npm ERR! notarget No matching version found for jquery@2.2.4 ~3.2.1
// rm -Rf project/project/ project/target/ target/; sbt fastOptJS && open index.html


// scalajsenv.js:26 Uncaught ReferenceError: exports is not defined at scalajsenv.js:26
