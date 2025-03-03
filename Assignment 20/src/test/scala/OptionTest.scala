import org.scalatest.funsuite.AnyFunSuite

class OptionTest extends AnyFunSuite {

  def doubleValue(opt: Option[Int]): Option[Int] = opt.map(_ * 2)

  def squareEven(opt: Option[Int]): Option[Int] = opt.flatMap(n =>
    if (n % 2 == 0) Some(n * n) else None
  )

  test("when some is given the doubleValue should double") {
    assert(doubleValue(Some(20)) == Some(40)) 
  }

  test("when input is none return None") {
    assert(doubleValue(None) == None)
  }

  test("it should return square of even number") {
    assert(squareEven(Some(4)) == Some(16))
  }

  test("it should return None when input is odd") {
    assert(squareEven(Some(3)) == None)
  }

  test("it should return None when input is None") {
    assert(squareEven(None) == None)
  }

  // Pattern matching test
  def matchOption(opt: Option[Int]): String = opt match {
    case Some(value) => s"value is $value"
    case None        => "no value found"
  }

  test("pattern matching correctly identifies Some and None cases") {
    assert(matchOption(Some(20)) == "value is 20")
    assert(matchOption(None) == "no value found")
  }
}