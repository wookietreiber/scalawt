
name := "scalawt"

version := "0.0.1"

organization := "org.software-is-free-on-kashyyyk"

scalaVersion := "2.9.0-1"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.5" % "test"
)

initialCommands := """
    import scalawt._
"""
