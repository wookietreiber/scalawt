import sbt._
import Keys._

import Resolvers._
import Dependencies._
import BuildSettings._

object BuildSettings {
  val buildOrganization = "com.github.wookietreiber.scalawt"
  val buildVersion      = "0.0.1"
  val buildScalaVersion = "2.9.1"

  val buildSettings = Defaults.defaultSettings ++ Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion
  )
}

object ScalawtBuild extends Build {
  lazy val root = Project ( "scalawt", file ("."),
    settings = buildSettings ++ Seq (
      libraryDependencies ++= Seq ( specs2 )
    )
  )
}

object Dependencies {
  val specs2 = "org.specs2" %% "specs2" % "1.6.1" % "test"
}

object Resolvers {
  val typesafe = "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"
}
