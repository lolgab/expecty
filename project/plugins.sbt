val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.16.0")
val scalaNativeVersion =
  Option(System.getenv("SCALANATIVE_VERSION")).getOrElse("0.5.4")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.9.0")
addSbtPlugin("com.eed3si9n" % "sbt-projectmatrix" % "0.10.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
addSbtPlugin("org.scala-native" % "sbt-scala-native" % scalaNativeVersion)
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
