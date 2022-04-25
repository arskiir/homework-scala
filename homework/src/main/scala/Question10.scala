object Q10 extends App {
  def alternate(
      f1: (Int, Int) => Int,
      f2: (Int, Int) => Int,
      list: List[Int]
  ): Int = {
    def al2(
        f1: (Int, Int) => Int,
        f2: (Int, Int) => Int,
        list: List[Int],
        acc: Int,
        i: Int = 0
    ): Int = {
      if (list.isEmpty) acc
      else if (i == 1)
        al2(f1, f2, list.tail, f1(acc, list.head), 2)
      else al2(f1, f2, list.tail, f2(acc, list.head), 1)
    }

    if (list.isEmpty) return 0
    return al2(f1, f2, list.tail, list.head, 1)
  }

  println(alternate(_ + _, _ - _, List(1, 2, 3, 4)))
}
