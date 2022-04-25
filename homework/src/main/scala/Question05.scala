object Q05 extends App {
    def mergesort(
        list: List[Int]
    ):(List[Int]) ={
        def merge(
            left: List[Int],
            right: List[Int],
            sorted: Boolean
        ):List[Int] = {
            if (left.isEmpty) {
                return right
            } else if (right.isEmpty) {
                return left
            }
            if (sorted){
                if (left.head < right.head) {
                    return left.head :: merge(left.tail, right, sorted)
                } else {
                    return right.head :: merge(left, right.tail, sorted)
                }
            } else {
                var left_split = left.length / 2
                var right_split = right.length / 2
                var (left_1, left_2) = split(left, left_split)
                var (right_1, right_2) = split(right, right_split)
                return merge(merge(left_1, left_2, false), merge(right_1, right_2, false), true)
            }
        }
        
        def split(
            list: List[Int],
            at: Int
        ):(List[Int], List[Int]) = {
            if(at == 0) return (List(), list)
            else{
                var (left, right) = split(list.tail, at-1)
                return (list.head::left, right)
            }
        }
        
        var at = list.length / 2
        var (left, right) = split(list, at)
        return merge(left, right, false)
    }

    println(mergesort(List(1, 2, 6, 8, 4, 7, 3, 5)))
    println(mergesort(List(6,5,4,3,2,1)))
    println(mergesort(List()))
}