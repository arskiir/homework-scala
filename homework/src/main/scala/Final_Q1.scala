object Final_Q1 extends App {
  def swapPair(l: List[Int], acc: List[Int] = List()): List[Int] = {
    if (l.isEmpty) acc
    else if (l.length == 1) acc ++ l
    else swapPair(l.tail.tail, acc ++ List(l.tail.head, l.head))
  }

  val list1 = List()
  val list2 = List(22)
  val list3 = List(1, 2, 3)
  val list4 = List(1, 2, 3, 4)
  val list5 = List(1, 2, 3, 4, 5)
  val list6 = List(1, 2, 3, 4, 5, 6)
  println(swapPair(list1) == List())
  println(swapPair(list2) == List(22))
  println(swapPair(list3) == List(2, 1, 3))
  println(swapPair(list4) == List(2, 1, 4, 3))
  println(swapPair(list5) == List(2, 1, 4, 3, 5))
  println(swapPair(list6) == List(2, 1, 4, 3, 6, 5))

}
