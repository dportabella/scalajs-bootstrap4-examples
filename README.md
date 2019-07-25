# scalajs-bootstrap4 examples

Clone from https://github.com/Karasiq/scalajs-bootstrap/blob/master/build.sbt
removing everything except for the bootstrap4 example

Trying to make it work using sbt-scalajs-bundler.


# Run
Run `sbt fastOptJS::webpack` and then open index.html on the web browser.

# It currently fails to compile
```
$ sbt fastOptJS::webpac
[info] Loading settings for project global-plugins from idea.sbt ...
[info] Loading global plugins from /Users/david/.sbt/1.0/plugins
[info] Loading settings for project scalajs-bootstrap-example-build from plugins.sbt ...
[info] Loading project definition from /Users/david/todelete/scalajs-bootstrap-example/project
[info] Updating ProjectRef(uri("file:/Users/david/todelete/scalajs-bootstrap-example/project/"), "scalajs-bootstrap-example-build")...
[info] Done updating.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Loading settings for project scalajs-bootstrap-example from version.sbt,build.sbt ...
[info] Set current project to scalajs-bootstrap-example (in build file:/Users/david/todelete/scalajs-bootstrap-example/)
[info] Updating ...
[info] Done updating.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Compiling 8 Scala sources to /Users/david/todelete/scalajs-bootstrap-example/target/scala-2.12/classes ...
[warn] there was one unchecked warning; re-run with -unchecked for details
[warn] one warning found
[info] Done compiling.
[info] Updating NPM dependencies
[info] Fast optimizing /Users/david/todelete/scalajs-bootstrap-example/target/scala-2.12/scalajs-bundler/main/scalajs-bootstrap-example-fastopt.js
[error] npm ERR! path /Users/david/.npm/_cacache/index-v5/ba/5e/cb33f007c3088b236318edb33f550733ae839cc0b1dc574b40c344eb50d4
[error] npm ERR! code EACCES
[error] npm ERR! errno -13
[error] npm ERR! syscall open
[error] npm ERR! Error: EACCES: permission denied, open '/Users/david/.npm/_cacache/index-v5/ba/5e/cb33f007c3088b236318edb33f550733ae839cc0b1dc574b40c344eb50d4'
[error] npm ERR!  [OperationalError: EACCES: permission denied, open '/Users/david/.npm/_cacache/index-v5/ba/5e/cb33f007c3088b236318edb33f550733ae839cc0b1dc574b40c344eb50d4'] {
[error] npm ERR!   cause: [Error: EACCES: permission denied, open '/Users/david/.npm/_cacache/index-v5/ba/5e/cb33f007c3088b236318edb33f550733ae839cc0b1dc574b40c344eb50d4'] {
[error] npm ERR!     errno: -13,
[error] npm ERR!     code: 'EACCES',
[error] npm ERR!     syscall: 'open',
[error] npm ERR!     path: '/Users/david/.npm/_cacache/index-v5/ba/5e/cb33f007c3088b236318edb33f550733ae839cc0b1dc574b40c344eb50d4'
[error] npm ERR!   },
[error] npm ERR!   isOperational: true,
[error] npm ERR!   stack: 'Error: EACCES: permission denied, open ' +
[error] npm ERR!     "'/Users/david/.npm/_cacache/index-v5/ba/5e/cb33f007c3088b236318edb33f550733ae839cc0b1dc574b40c344eb50d4'",
[error] npm ERR!   errno: -13,
[error] npm ERR!   code: 'EACCES',
[error] npm ERR!   syscall: 'open',
[error] npm ERR!   path: '/Users/david/.npm/_cacache/index-v5/ba/5e/cb33f007c3088b236318edb33f550733ae839cc0b1dc574b40c344eb50d4',
[error] npm ERR!   parent: 'accepts'
[error] npm ERR! }
[error] npm ERR!
[error] npm ERR! The operation was rejected by your operating system.
[error] npm ERR! It is likely you do not have the permissions to access this file as the current user
[error] npm ERR!
[error] npm ERR! If you believe this might be a permissions issue, please double-check the
[error] npm ERR! permissions of the file and its containing directories, or try running
[error] npm ERR! the command again as root/Administrator (though this is not recommended).
[error] npm ERR! A complete log of this run can be found in:
[error] npm ERR!     /Users/david/.npm/_logs/2019-07-25T14_59_57_446Z-debug.log
[error] java.lang.RuntimeException: Non-zero exit code: 243
[error] 	at scala.sys.package$.error(package.scala:26)
[error] 	at scalajsbundler.util.Commands$.$anonfun$run$9(Commands.scala:38)
[error] 	at scala.util.Either.fold(Either.scala:188)
[error] 	at scalajsbundler.util.Commands$.run(Commands.scala:38)
[error] 	at scalajsbundler.ExternalCommand.run(ExternalCommand.scala:21)
[error] 	at scalajsbundler.sbtplugin.NpmUpdateTasks$.$anonfun$npmUpdate$1(NpmUpdateTasks.scala:34)
[error] 	at sbt.util.FileFunction$.$anonfun$cached$1(FileFunction.scala:73)
[error] 	at sbt.util.FileFunction$.$anonfun$cached$4(FileFunction.scala:147)
[error] 	at sbt.util.Difference.apply(Tracked.scala:313)
[error] 	at sbt.util.Difference.apply(Tracked.scala:293)
[error] 	at sbt.util.FileFunction$.$anonfun$cached$3(FileFunction.scala:143)
[error] 	at sbt.util.Difference.apply(Tracked.scala:313)
[error] 	at sbt.util.Difference.apply(Tracked.scala:288)
[error] 	at sbt.util.FileFunction$.$anonfun$cached$2(FileFunction.scala:142)
[error] 	at scalajsbundler.sbtplugin.NpmUpdateTasks$.npmUpdate(NpmUpdateTasks.scala:45)
[error] 	at scalajsbundler.sbtplugin.ScalaJSBundlerPlugin$.$anonfun$perConfigSettings$5(ScalaJSBundlerPlugin.scala:543)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:40)
[error] 	at sbt.std.Transform$$anon$4.work(System.scala:67)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:269)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error] 	at sbt.Execute.work(Execute.scala:278)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:269)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
[error] 	at java.lang.Thread.run(Thread.java:745)
[error] (Compile / npmUpdate) Non-zero exit code: 243
[error] Total time: 32 s, completed Jul 25, 2019 4:59:57 PM
```
