scalaVersion := "3.3.1"

libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M10" % Test

coverageEnabled := true
// The coverage will be in an "out" folder for easier access :)
coverageDataDir := file("out")

// add aliases for more arcane command sequences
addCommandAlias("testCoverage", ";clean;test;coverageReport")
