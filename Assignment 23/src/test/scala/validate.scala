object Validate {

  def testFileReadingSuccess(): Unit = {
    val filePath = "test_success.txt"
    Task3.writeFile(filePath, "Hello, world")

    val result = Task1.reading(filePath)

    assert(result.isRight, "File reading should succeed")
    assert(result == Right("Hello, world"), "File content should match")
  }

  def testFileReadingFailure(): Unit = {
    val nonExistentFile = "non_existent.txt"

    val result = Task1.reading(nonExistentFile)

    assert(result.isLeft, "File reading should fail for a non-existent file")
    assert(result.left.get.contains("No such file"), "missing file")
  }

  def testFileWritingSuccess(): Unit = {
    val filePath = "test_write.txt"
    val content = "Scala File Writing Test"

    val result = Task3.writeFile(filePath, content)

    assert(result.isRight, "File writing should succeed")

    val readResult = Task1.reading(filePath)
    assert(readResult == Right(content), "Written content should be correctly read")
  }

  def testFileWritingFailure(): Unit = {
    val invalidPath = "/invalid_path/test_write.txt"
    val content = "This should fail"

    val result = Task3.writeFile(invalidPath, content)

    assert(result.isLeft, "File writing should fail for an invalid path")
    assert(result.left.get.contains("Permission denied") || result.left.get.contains("No such file"), "Error should indicate invalid path")
  }

  def main(args: Array[String]): Unit = {
    testFileReadingSuccess()
    testFileReadingFailure()
    testFileWritingSuccess()
    testFileWritingFailure()
    println("All test cases passed!")
  }
}