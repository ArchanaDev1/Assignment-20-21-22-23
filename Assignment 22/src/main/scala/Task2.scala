import scala.util.{Try, Success, Failure}

object Task2:

  private def exception(input: String): Try[Int] = Try(input.toInt)

  def increaseResult(input: String): Try[Int] =
    exception(input).map(_ + 1)

  def doubleResult(input: String): Try[Int] =
    exception(input).map(_ * 2)

  def handleResult(input: String): String =
    exception(input) match
      case Success(value) => s"Success: $value"
      case Failure(ex)    => s"Failure: ${ex.getMessage}"