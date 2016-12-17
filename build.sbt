val scalaVer = "2.12.1"

lazy val commonSettings = Seq(
  organization := "org.santoslab.compilers",
  incOptions := incOptions.value.withNameHashing(true),
  scalaVersion := scalaVer,
  scalacOptions ++= Seq("-target:jvm-1.8", "-deprecation",
    "-Ydelambdafy:method", "-feature", "-unchecked"),
  javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
  javacOptions in(Compile, doc) := Seq("-notimestamp", "-linksource"),
  libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0",
    "org.antlr" % "antlr4-runtime" % "4.5.3",
    "org.antlr" % "ST4" % "4.0.8",
    "org.ow2.asm" % "asm" % "5.1",
    "org.ow2.asm" % "asm-commons" % "5.1",
    "org.ow2.asm" % "asm-util" % "5.1",
    "org.eclipse.birt.runtime" % "org.eclipse.core.resources" % "latest.integration",
    "org.eclipse.core" % "runtime" % "latest.integration",
    "org.eclipse.tycho" % "org.eclipse.jdt.core" % "latest.integration",
    "com.novocode" % "junit-interface" % "0.11" % "test"
  ),
  testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v"),
  autoAPIMappings := true,
  crossPaths := false
)

lazy val sjc = (project in file("sjc")).settings(commonSettings: _*)

lazy val examples = (project in file("examples")).
  settings(commonSettings: _*).
  dependsOn(sjc)