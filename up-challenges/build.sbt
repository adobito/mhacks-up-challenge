name := """up-challenges"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  anorm,
  cache,
  ws,
  "com.google.http-client" % "google-http-client" % "1.19.0",
  "com.google.code.gson" % "gson" % "2.3",
  "com.google.http-client" % "google-http-client-gson" % "1.19.0",
  "com.microsoft.azure" % "azure-core" % "0.6.0",
  "org.hibernate" % "hibernate-core" % "4.3.5.Final",
  "org.hibernate" % "hibernate-c3p0" % "4.3.5.Final",
  "org.hibernate" % "hibernate-ehcache" % "4.3.5.Final",
  "mysql" % "mysql-connector-java" % "5.1.29",
  "com.microsoft.azure" % "azure-management-sql" % "0.6.0"
)
