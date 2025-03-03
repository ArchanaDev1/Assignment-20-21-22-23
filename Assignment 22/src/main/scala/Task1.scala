//Task1:Wrap a computation that might throw an exception inside a Try block.

import scala.util.{Try, Success, Failure}

object Task1 {
  def exception(input: String): Try[Int] = Try {
    input.toInt
  }
}