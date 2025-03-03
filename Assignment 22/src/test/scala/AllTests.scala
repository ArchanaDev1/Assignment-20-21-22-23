object AllTests {

  def main(args: Array[String]): Unit = {


    assert(Task1.exception("123456") == scala.util.Success(123456))
    assert(Task1.exception("Archana").isFailure)

    assert(Task2.increaseResult("8") == scala.util.Success(9))
    assert(Task2.increaseResult("lmn").isFailure)

    assert(Task2.doubleResult("5") == scala.util.Success(10))
    assert(Task2.doubleResult("abc").isFailure)

    assert(Task2.handleResult("100") == "Success: 100")
    assert(Task2.handleResult("abc").startsWith("Failure:"))

    // Task3 Tests
    assert(Task3.Recover("1000") == scala.util.Success(1000))
    assert(Task3.Recover("abc") == scala.util.Success(0))

    assert(Task3.RecoverWith("500") == scala.util.Success(500))
    assert(Task3.RecoverWith("abc") == scala.util.Success(-1))
    println("All tests passed successfully!")
  }
}