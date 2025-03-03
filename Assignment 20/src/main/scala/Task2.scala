//Task2:Create a method that transforms the optional value using map and flatMap.
//using map

  def doubleValue(opt: Option[Int]): Option[Int] = {
    opt.map(_ * 2)
  }

  //using flatMap
  def squareEven(opt: Option[Int]): Option[Int] = {
    opt.flatMap(n => if (n % 2 == 0)
      Some(n * n) else None)
  }

