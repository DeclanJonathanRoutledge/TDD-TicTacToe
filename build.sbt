name := "TDD-training"

version := "0.1"

scalaVersion := "2.13.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % "test"

val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.9"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
)