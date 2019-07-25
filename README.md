# scalajs-bootstrap4 examples

Clone from https://github.com/Karasiq/scalajs-bootstrap/blob/master/build.sbt
removing everything except for the bootstrap4 example

Trying to make it work using jsDependencies (instead of webpack).


# Run
Run `sbt fastOptJS` and then open index.html on the web browser.

The browser console shows this error:

`Uncaught ReferenceError: exports is not defined at scalajsenv.js:29`

How to modify `build.sbt` to make this project work?


# using sbt-scalajs-bundler
I've also tried using the sbt-scalajs-bundler as follows:

project/plugins.sbt:
```
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.28")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.15.0")
```

build.sbt file:
```
enablePlugins(ScalaJSBundlerPlugin)

scalaVersion := "2.12.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"
libraryDependencies += "com.github.karasiq" %%% "scalajs-bootstrap-v4" % "2.3.5"

npmDependencies in Compile += "jquery" -> "2.2.4"
npmDependencies in Compile += "bootstrap" -> "4.3.1"

mainClass in Compile := Some("com.karasiq.bootstrap4.test.frontend.BootstrapTestApp")
scalaJSUseMainModuleInitializer := true
```

But it fails:
```
$ sbt fastOptJS::webpack
[error] sbt.librarymanagement.ResolveException: unresolved dependency: com.github.karasiq#scalajs-bootstrap-v4_sjs1.0.0-M7_2.12;2.3.5: not found
```
