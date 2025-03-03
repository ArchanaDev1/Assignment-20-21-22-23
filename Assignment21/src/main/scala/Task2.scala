//Task2: Chain multiple computations that may fail, ensuring
// that the error propagates correctly through the chain.
def validation(number: Int): Either[String, Int] =
  if number > 0 then Right(number)
  else Left(s" positive, but got $number")

def processedInput(input: String): Either[String, Int] =
  validateAndConvert(input).flatMap(validation)