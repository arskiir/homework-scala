object Q10 extends App {
    def maxAll(
        lists: List[List[Int]]
    ) :List[Int] = {
        def removeList(
            lists: List[List[Int]],
            len: Int
        ) :List[List[Int]] = {
            if (lists.isEmpty) List()
            else {
                if (lists.head.length < len) removeList(lists.tail, len)
                else lists.head :: removeList(lists.tail, len)
            }
        }

        def getIthElement(
            l: List[Int],
            i: Int
        ): Int = {
            if (l.isEmpty) -1
            else if (i == 0) l.head
            else getIthElement(l.tail, i - 1)
        }

        def getMaxIthElement(
            l: List[List[Int]],
            i: Int,
            max: Int = -1
        ): Int = {
            if (l.isEmpty) max
            else {
                val curr = getIthElement(l.head, i)
                if (curr > max ) getMaxIthElement(l.tail, i, curr)
                else getMaxIthElement(l.tail, i, max)
            }
        }

        def getMax(
            l: List[List[Int]],
            curr: Int,
            acc: List[Int] = List()
        ): List[Int] = {
            if (l.isEmpty) acc
            else {
                var max = getMaxIthElement(l, curr)
                if (max == -1) acc
                else getMax(removeList(l,curr+1), curr + 1, acc ++ List(max))
            }
        }
        getMax(lists, 0)
    }
    println(maxAll(List()))
    println(maxAll(List(List())))
    println(maxAll(List(List(1,2,3,4,8,9),List(),List(4,5),List(1,2,3,5,6,10,11))))
    println(maxAll(List(List(3,4),List(1,2,3,4,51,61),List(1,2,31,41,61,51))))
    println(maxAll(List(List(1,2,3,40,5,6),List(10,2,30,4),List(1,200),List(0,0,0,0,0,0,0,0,9))))
}