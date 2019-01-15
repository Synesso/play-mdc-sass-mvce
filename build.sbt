name := "sassy"
organization := "io.github.synesso"
version := "0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  guice, evolutions, jdbc,
  "org.webjars.npm" % "material-components-web" % "0.43.0" excludeAll(
    ExclusionRule("org.webjars.npm", "material__image-list"),
    ExclusionRule("org.webjars.npm", "material__icon-toggle"),
    ExclusionRule("org.webjars.npm", "material__dom"),
    ExclusionRule("org.webjars.npm", "material__typography"),
    ExclusionRule("org.webjars.npm", "material__shape"),
    ExclusionRule("org.webjars.npm", "material__linear-progress"),
    ExclusionRule("org.webjars.npm", "material__floating-label"),
    ExclusionRule("org.webjars.npm", "material__dialog"),
    ExclusionRule("org.webjars.npm", "material__menu")
  ),
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
)
