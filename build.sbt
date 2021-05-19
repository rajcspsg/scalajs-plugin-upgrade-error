name := "scalajs-plugin-upgrade-error"

version := "0.1"

val commonSettings = Seq(
  scalaVersion := "2.11.11",
  crossScalaVersions := Seq("2.11.11", "2.12.2"),
  scalacOptions ++= Seq(
    "-feature", "-deprecation",
    "-Xlint", "-Ywarn-unused-import", "-Xfatal-warnings"
  ),
  scalacOptions in (Compile, doc) += "-no-link-warnings"
)

lazy val scalajs_plugin_upgrade_error = crossProject.in(file("."))
  .settings(commonSettings)
  .settings(
    name := "scalajs-plugin-upgrade-error",
    version := version.value
  )

lazy val zipperJVM = scalajs_plugin_upgrade_error.jvm
lazy val zipperJS = scalajs_plugin_upgrade_error.js
