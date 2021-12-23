fun main() {
 val nums1 = listOf<Int>(1,2,3,4,5,6,7,8,22,13,14,16,17,122,143)
    //val list:List<Int> =nums1.filter (::isOdd)
    //val list =nums1.filter{aInt->a%2!=0}
    val list =nums1.filter { it%2!=0 }
    val userList= listOf(User(1,"vishal"),
        User(4,"vish"),
        User(2,"vk "),
        User(3,"kumar"))
    userList.filter { it.id ==2 }

    // map is used to convert from one form to other form
    val list2 =nums1.map {it*it  }
    println(list2)
    val paidUserList =userList.map{
        PaidUser(it.id,it.name, "Paid")
    }

    println(list)
    println(paidUserList)


    // foreach



    nums1.forEach { println(it*it) }



}

fun isOdd(a:Int): Boolean{
    return a % 2!=0
}
data class User(val id :Int,val name:String)
data class PaidUser(val id :Int,val name :String, val type :String)