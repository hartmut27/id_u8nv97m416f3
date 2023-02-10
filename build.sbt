ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

ThisBuild / javacOptions ++= Seq("-source", "11", "-target", "11")

lazy val root = (project in file("."))
  .settings(
    name := "id_u8nv97m416f3",
    idePackagePrefix := Some("com.cetalison.id_u8nv97m416f3")
  )
