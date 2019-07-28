# scalajs-bootstrap4 examples

Clone from https://github.com/Karasiq/scalajs-bootstrap/blob/master/build.sbt
removing everything except for the bootstrap4 example and using sbt-scalajs-bundler.


# Run
Run `sbt fastOptJS::webpack` and then open index.html on the web browser.


# Some other issues
```
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.15.0")
[error] sbt.librarymanagement.ResolveException: unresolved dependency: com.github.karasiq#scalajs-bootstrap-v4_sjs1.0.0-M7_2.12;2.3.5: not found
Solved by using addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.13.0"


npmDependencies in Compile += "jquery" -> "3.4.1"
  [error] npm ERR! notarget No matching version found for jquery@2.2.4 ~3.2.1
Solved by using: npmDependencies in Compile += "jquery" -> "3.2.1"


npmDependencies in Compile += "bootstrap" -> "4.3.1"
 [error] npm ERR! notarget No matching version found for bootstrap@4.3.1 ~4.1.1
Solved by using npmDependencies in Compile += "bootstrap" -> "4.1.1"
```
