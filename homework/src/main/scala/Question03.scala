object Q03 extends App {
    def subList(
        l1:List[Any], 
        l2:List[Any]
    ):Boolean ={
        def isIn(
            x: Any,
            l: List[Any]
        ):Boolean = {
            if (l.isEmpty) false
            else if (x == l.head) true
            else isIn(x, l.tail)
        }
        if (l1.isEmpty) true
        else if (isIn(l1.head, l2)) subList(l1.tail, l2)
        else false
    }
    println(subList(List(1,2,3,4,5), List(1,2,3)))
    println(subList(List(1,2,3,4), List(1,2,3,4,5)))
    println(subList(List(1,2,3,4,5), List(1,2,3,4,5)))
    println(subList(List(), List(1,2,3,4,5)))
}