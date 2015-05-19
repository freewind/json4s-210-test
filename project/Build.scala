case class Config(name: String)
case class Project(name: String, configs: Seq[Config])
