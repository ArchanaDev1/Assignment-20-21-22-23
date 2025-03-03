import scala.util.{Try, Success, Failure}

object Task3 {

  def Recover(input: String): Try[Int] = {
    Task1.exception(input).recover {
      case _: NumberFormatException => 0
    }
  }

  def RecoverWith(input: String): Try[Int] = {
    Task1.exception(input).recoverWith {
      case _: NumberFormatException => Success(-1) 
    }
  }
}