name := "exercises"

version := "0.1"

ThisBuild / scalaVersion := "2.13.7"

inThisBuild {

  List(
    scalaVersion := "2.13.7",
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    scalafixScalaBinaryVersion := (ThisBuild / scalaBinaryVersion).value,
    scalafixDependencies ++= Seq(
      "com.github.vovapolu" %% "scaluzzi" % "0.1.18"
    )
  )
}

val libraries = Seq(
  "org.scalatest"     %% "scalatest"       % "3.2.3"         % Test,
  "org.scalatestplus" %% "scalacheck-1-15" % "3.3.0.0-SNAP3" % Test
)

val kindProjectorDep = "org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full

// Добавляем пакеты по мере прохождения курса
lazy val exercises01 = project in file("exercises01") settings (libraryDependencies ++= libraries)
lazy val exercises02 = project in file("exercises02") settings (libraryDependencies ++= libraries)
lazy val exercises03 = project in file("exercises03") settings (libraryDependencies ++= libraries)
lazy val exercises04 = project in file("exercises04") settings (libraryDependencies ++= libraries)

lazy val lection02 = project in file("lection02") settings (libraryDependencies ++= libraries)
lazy val lection03 = project in file("lection03") settings (libraryDependencies ++= libraries)
