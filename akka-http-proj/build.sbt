name := "akka-http-proj"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= {
  val akkaV       = "2.5.12"
  val akkaHttpV   = "10.1.3"
  Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka" %% "akka-http" % akkaHttpV
  )
}