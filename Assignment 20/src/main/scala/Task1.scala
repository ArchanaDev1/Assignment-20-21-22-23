// Task1: Implement a function that retrieves an element from a collection by index
// and returns it as an Option[T].
def getElement[T](list:List[T],index:Int): Option[T]={
  if(index >=0 && index < list.length) Some(list(index))
  else None

}