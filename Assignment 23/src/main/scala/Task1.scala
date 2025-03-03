object Task1 {
  def reading (filePath:String):Either[String,String]={
    scala.util.Using(scala.io.Source.fromFile(filePath)){
      source=>source.getLines().mkString("\n")
    }.toEither.left.map(_.getMessage)
  }
}
