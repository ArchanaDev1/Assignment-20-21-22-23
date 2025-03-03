object Task2 {
  def safereading(filePath: String): String = {
    Task1.reading (filePath) match {
      case Right(content) => content
      case Left(error) => "Error: " + error
    }
  }
}