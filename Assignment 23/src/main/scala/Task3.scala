object Task3 {
  def writeFile(filePath: String, content: String): Either[String, Unit] = {
    scala.util.Using(new java.io.BufferedWriter(new java.io.FileWriter(filePath))) { writer =>
      writer.write(content)
    }.toEither.left.map(_.getMessage)
  }
}