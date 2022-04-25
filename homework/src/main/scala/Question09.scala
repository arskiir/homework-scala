object Q09 extends App {
  def turingStep(
      f: Char => Char,
      tape: List[Char],
      n: Int
  ): List[Char] = {
    def t(
        f: Char => Char,
        tape: List[Char],
        n: Int,
        acc: List[Char] = Nil
    ): List[Char] = {
      if (n == 0 || tape.isEmpty) acc ++ tape
      else t(f, tape.tail, n - 1, acc ++ List(f(tape.head)))
    }

    t(f, tape, n)
  }

  def toJ(c: Char): Char = 'j'

  println(turingStep(toJ, List('A', 'B', 'C'), 2))
}
