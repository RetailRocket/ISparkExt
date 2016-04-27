name := "ISparkExt"

version := "0.1"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.1" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.1" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-graphx" % "1.6.1" % "provided"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "org.rogach" %% "scallop" % "0.9.5"

libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "1.8.0"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers += "Cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

resolvers += "Maven" at "http://repo1.maven.org/maven2/"

testOptions in Test += Tests.Argument("-oF")

fork in Test := true

parallelExecution in Test := false
