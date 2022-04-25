object Q01 extends App {
  def insertATPosition(
      x: Any,
      pos: Int = 0,
      l: List[Any]
  ): List[Any] = {
    def insert(
        x: Any,
        i: Int = 0,
        pos: Int,
        l: List[Any]
    ): List[Any] = {
      if (i == pos) x :: l
      else l.head :: insert(x, i + 1, pos, l.tail)
    }
    if (pos <= 0) return x :: l
    if (pos >= l.length) return l ++ List(x)
    insert(x, 0, pos, l)
  }
  println(insertATPosition(1, -1, List(2, 3, 4, 5)))
  println(insertATPosition(1, 0, List(2, 3, 4, 5)))
  println(insertATPosition(1, 1, List(2, 3, 4, 5)))
  println(insertATPosition(1, 2, List(2, 3, 4, 5)))
  println(insertATPosition(1, 3, List(2, 3, 4, 5)))
  println(insertATPosition(1, 4, List(2, 3, 4, 5)))
  println(insertATPosition(1, 5, List(2, 3, 4, 5)))
}
