val scalaVer = "2.12.12"

val sjcInputKey = {
  val sjc = inputKey[Unit]("Run sjc")
  sjc
}

lazy val commonSettings = Seq(
  organization := "org.santoslab.compilers",
  scalaVersion := scalaVer,
  scalacOptions ++= Seq("-target:jvm-1.8", "-deprecation",
    "-Ydelambdafy:method", "-feature", "-unchecked"),
  javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
  javacOptions in(Compile, doc) := Seq("-notimestamp", "-linksource"),
  libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.1",
    "org.antlr" % "antlr4-runtime" % "4.8-1",
    "org.antlr" % "ST4" % "4.3.1",
    "org.ow2.asm" % "asm" % "8.0.1",
    "org.ow2.asm" % "asm-commons" % "8.0.1",
    "org.ow2.asm" % "asm-util" % "8.0.1",
    "org.eclipse.platform" % "org.eclipse.core.resources" % "3.13.700",
    "org.eclipse.platform" % "org.eclipse.core.runtime" % "3.18.0",
    "org.eclipse.platform" % "org.eclipse.equinox.app" % "1.4.500",
    "org.eclipse.jdt" % "org.eclipse.jdt.core" % "3.22.0",
    "com.novocode" % "junit-interface" % "0.11" % "test"
  ),
  testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v"),
  autoAPIMappings := true,
  crossPaths := false
)

lazy val sjc = (project in file("sjc")).
  settings(commonSettings: _*).
  settings(
    fullRunInputTask(sjcInputKey, Compile, "sjc.SJC")
  )

lazy val examples = (project in file("examples")).
  settings(commonSettings: _*).
  dependsOn(sjc)
