object Q04 extends App {
  def palindrome(list: List[Any]): Boolean = {
    def last(list: List[Any]): Any = list match {
      case Nil      => throw new NoSuchElementException
      case x :: Nil => x
      case x :: xs  => last(xs)
    }
    def stripHeadAndLast(list: List[Any]): List[Any] = list match {
      case Nil      => Nil
      case x :: Nil => Nil
      case x :: xs  => stripHeadAndLast(xs.tail)
    }

    if (list.isEmpty || list.length == 1) true
    else if (list.head == last(list))
      palindrome(stripHeadAndLast(list))
    else false
  }

  println(palindrome(List(1, 2, 1)))
}
