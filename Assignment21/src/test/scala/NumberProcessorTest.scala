import org.scalatest.funsuite.AnyFunSuite

class NumberProcessorTest extends AnyFunSuite:

  test("validateAndConvert should return Right for valid numbers") {
    assert(NumberProcessor.validateAndConvert("50") == Right(50))
  }

  test("validateAndConvert should return Left for invalid numbers") {
    assert(NumberProcessor.validateAndConvert("Archana") == Left("Invalid number: 'Archana'"))
  }

  test("validation should return Right for positive numbers") {
    assert(NumberProcessor.validation(15) == Right(15))
  }

  test("validatePositive should return Left for non-positive numbers") {
    assert(NumberProcessor.validation(-9) == Left("positive, but got -9"))
  }

  test("processInput should correctly chain operations") {
    assert(NumberProcessor.processInput("50") == Right(50))
    assert(NumberProcessor.processInput("-10") == Left("positive, but got -10"))
    assert(NumberProcessor.processInput("Archana") == Left("Invalid number: 'Archana'"))
  }