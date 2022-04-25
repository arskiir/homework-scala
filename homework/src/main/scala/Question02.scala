object Q02 extends App {
  def insertInOrder(
      x: Int,
      list: List[Int]
  ): List[Int] = {
    if (list.isEmpty) List(x)
    else if (x < list.head) x :: list
    else list.head :: insertInOrder(x, list.tail)
  }
  println(insertInOrder(0, List(1, 2, 4, 5)))
  println(insertInOrder(3, List(1, 2, 4, 5)))
  println(insertInOrder(6, List(1, 2, 4, 5)))
}
