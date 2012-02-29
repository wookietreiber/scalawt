import sbt._
import Keys._

import Resolvers._
import Dependencies._
import BuildSettings._

object BuildSettings {
  lazy val buildOrganization = "com.github.scalawt"
  lazy val buildVersion      = "0.1-SNAPSHOT"
  lazy val buildScalaVersion = "2.9.1"

  lazy val buildSettings = Defaults.defaultSettings ++ Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion,
    resolvers    += typesafe
  )
}

object ScalawtBuild extends Build {
  lazy val root = Project ( "scalawt", file ("."),
    settings = buildSettings ++ Seq (
      libraryDependencies ++= Seq ( actor, specs2 )
    )
  )
}

object Dependencies {
  lazy val actor  = "com.typesafe.akka" % "akka-actor" % "2.0-RC3"
  lazy val specs2 = "org.specs2" %% "specs2" % "1.8.2" % "test"
}

object Resolvers {
  lazy val typesafe = "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"
}
