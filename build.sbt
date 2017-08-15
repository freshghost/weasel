
lazy val root = (project in file("."))
 .disablePlugins(ScalaJSPlugin)
.settings(
       name := "hello",
    scalaVersion := "2.11.8",
    libraryDependencies ++=Seq("org.springframework.boot"%"spring-boot-starter-web"%"1.5.4.RELEASE",
       "org.springframework.boot"%"spring-boot-starter-jdbc"%"1.5.4.RELEASE" , 
       "org.apache.hive"%"hive-jdbc"%"2.1.0" exclude("org.eclipse.jetty.aggregate","jetty-all"),
       "com.fasterxml.jackson.core"%"jackson-core"%"2.6.5",
       "com.fasterxml.jackson.core"%"jackson-databind"%"2.6.5",
       "com.fasterxml.jackson.core"%"jackson-annotations"%"2.6.5"
   )
)
