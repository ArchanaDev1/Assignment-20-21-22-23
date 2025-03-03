import scala.io.StdIn.readLine
import scala.util.Try
object NumberProcessor:

  def validateAndConvert(input: String): Either[String, Int] =
    Try(input.toInt).toEither.left.map(_ => s"Invalid number: '$input'")

  def validation(number: Int): Either[String, Int] =
    if number > 0 then Right(number)
    else Left(s"positive, but got $number")

  def processInput(input: String): Either[String, Int] =
    validateAndConvert(input).flatMap(validation)


  def execute(): Unit =
    println("Enter a positive number:")
    val input = readLine()
    processInput(input) match
      case Right(value) => println(s"Success! You entered: $value")
      case Left(error)  => println(s"Error: $error. try again.")

@main def main(): Unit = NumberProcessor.execute()