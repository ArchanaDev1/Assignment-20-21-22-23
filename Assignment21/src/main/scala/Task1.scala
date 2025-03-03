//Task1: Create a function that processes input data and returns an Either[String, T],
// where the error case is signified by a Left containing an error message.
import scala.util.Try

def validateAndConvert(input: String): Either[String, Int] =
  Try(input.toInt).toEither.left.map(_ => s"Invalid number: '$input'")

