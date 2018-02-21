enablePlugins(JavaAppPackaging)

organization  := "org.renci"

name          := "pubmed-terms"

version       := "0.1-SNAPSHOT"

licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))

scalaVersion  := "2.12.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

scalacOptions in Test ++= Seq("-Yrangepos")

mainClass in Compile := Some("org.renci.chemotext.Main")

javaOptions += "-Xmx20G"

fork in Test := true

libraryDependencies ++= {
  Seq(
    "org.backuity.clist"          %% "clist-core"             % "3.2.2",
    "org.backuity.clist"          %% "clist-macros"           % "3.2.2" % "provided",
    "com.typesafe.akka"           %% "akka-stream"            % "2.5.9",
    "com.typesafe.akka"           %% "akka-http"              % "10.0.11",
    "org.scala-lang.modules"      %% "scala-xml"              % "1.0.6",
    "io.circe"                    %% "circe-core"             % "0.9.1",
    "io.circe"                    %% "circe-generic"          % "0.9.1",
    "io.circe"                    %% "circe-parser"           % "0.9.1",
    "de.heikoseeberger"           %% "akka-http-circe"        % "1.20.0-RC2",
    "com.typesafe.scala-logging"  %% "scala-logging"          % "3.7.1",
    "ch.qos.logback"              %  "logback-classic"        % "1.2.3",
    "org.codehaus.groovy"         %  "groovy-all"             % "2.4.6",
    "org.apache.jena"             %  "apache-jena-libs"       % "3.2.0" //pomOnly()
  )
}
