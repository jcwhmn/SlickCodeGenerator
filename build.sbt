import Dependencies._

lazy val SlickCodeGenerator = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.jcwhmn",
      scalaVersion := "2.12.2",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "SlickCodeGenerator",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "com.typesafe.play" %% "play-json" % "2.6.2",
      "ch.qos.logback"      % "logback-classic" % "1.2.3",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
    )
  )
