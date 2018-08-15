name := "system-monitor"

version := "1.1"

scalaVersion := "2.12.6"

enablePlugins(DockerPlugin)
enablePlugins(AshScriptPlugin)

scalacOptions ++= Seq("-feature")

lazy val akkaVersion = "2.5.13"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % "test",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

dockerBaseImage := "openjdk:jre-alpine"

