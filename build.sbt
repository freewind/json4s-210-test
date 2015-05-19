name := "json4s-210-test"

version := "1.0"

scalaVersion := "2.10.4"

lazy val json = taskKey[Unit]("output a json with json4s")

json := {
  implicit val formats = org.json4s.DefaultFormats
  val project = Project("myproject", Seq(Config("conf1")))
  val json = org.json4s.native.Serialization.write(project)
  println(json)
}
