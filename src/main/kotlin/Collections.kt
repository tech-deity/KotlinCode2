fun main() {
    val list1 =listOf(1,2.0,3,5,6)
    println(list1)

    println(list1.get(1))

    val list2 = mutableListOf(1,2,3,4,5,4,4,4,4,2,2,3,2,1,2,3)
    list2.add(4456)
    println(list2)
    list2.removeAt(15)

    println(list2)

    val map1 =mutableMapOf<Char,String>()

    map1.put('B',"ravi")
    map1.put('A',"ram")
    map1.put('C',"ravikant")
println(map1)
}
