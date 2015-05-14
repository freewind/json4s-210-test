import org.json4s.native.Serialization

object Main extends App {

  implicit val formats = org.json4s.DefaultFormats

  val subProject = new SubProject("Hello", Nil)

  println(Serialization.write(subProject))

}

case class Project(name: String, subProjects: Seq[SubProject] = Nil)
case class SubProject(name: String, configurations: Seq[Configuration])
case class Configuration(name: String, modules: Seq[Module])
case class Module(organization: String, name: String, revision: String)
