val scalaVer = "2.12.4"

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
    "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0",
    "org.antlr" % "antlr4-runtime" % "4.7.1",
    "org.antlr" % "ST4" % "4.0.8",
    "org.ow2.asm" % "asm" % "6.0",
    "org.ow2.asm" % "asm-commons" % "6.0",
    "org.ow2.asm" % "asm-util" % "6.0",
    "org.eclipse.platform" % "org.eclipse.core.resources" % "3.12.0",
    "org.eclipse.platform" % "org.eclipse.core.runtime" % "3.13.0",
    "org.eclipse.platform" % "org.eclipse.equinox.app" % "1.3.400",
    "org.eclipse.jdt" % "org.eclipse.jdt.core" % "3.13.100",
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
