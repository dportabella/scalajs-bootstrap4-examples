# scalajs-bootstrap4 examples

Clone from https://github.com/Karasiq/scalajs-bootstrap/blob/master/build.sbt
removing everything except for the bootstrap4 example

Trying to make it work using sbt-scalajs-bundler.


# Run
Run `sbt fastOptJS::webpack` and then open index.html on the web browser.

But it fails:
```
$ sbt fastOptJS::webpack
[error] sbt.librarymanagement.ResolveException: unresolved dependency: com.github.karasiq#scalajs-bootstrap-v4_sjs1.0.0-M7_2.12;2.3.5: not found
```
