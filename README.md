# scalajs-bootstrap4 examples

Clone from https://github.com/Karasiq/scalajs-bootstrap/blob/master/build.sbt
removing everything except for the bootstrap4 example

Trying to make it work using jsDependencies (instead of webpack).


# Run
Run `sbt fullOptJS` and then open index.html on the web browser.

The browser console shows this error:

`Uncaught ReferenceError: exports is not defined at scalajsenv.js:29`

How to modify `build.sbt` to make this project work?
