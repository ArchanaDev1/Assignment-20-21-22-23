//Task3 :Demonstrate safe chaining of operations on optional values with for-comprehensions.
def cResult(opt1:Option[Int], opt2:Option[Int]):
Option[Int]={
  for{
    x<-opt1
    y<-opt2
  }
    yield x+y
}