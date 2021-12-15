fun main() {

    //DEF.defOBj()
    Sharing.incrementFBLikes()
    Sharing.incrementFBLikes()
    Sharing.incrementFBLikes()

    Sharing.incrementTwitterLikes()
    Sharing.incrementTwitterLikes()
    Sharing.incrementTwitterLikes()
    Sharing.incrementTwitterLikes()
    Sharing.incrementTwitterLikes()
   // Sharing.display()


//    var objEx =object{ //object Expression
//        val x:Int=10
//        fun method(){
//            println("i am object expression")
//        }
//    }
//
//    objEx.method()
    var obJex = object :Persons("Vishal "),C {
        override fun cl() {
            println("this is clone method")
        }

        override fun fullName() {
            super.fullName()
            println("my name is $name")
        }

    }

    obJex.cl()
    obJex.fullName()
}

object ABC{

    val num:Int=10

}

object DEF{
    var name :String ="Vishal"

    fun defOBj(){
        println("my name is $name")
    }
}
object Sharing{
    private var Fblike:Int=0
    private var Twitterlike:Int=0

    fun incrementFBLikes()= Fblike++
    fun incrementTwitterLikes()=Twitterlike++
    fun display()=println("fb likes -$Fblike twitter likes -$Twitterlike")


}

interface C{
    fun cl()

}

open class TESTs{
    val a :Int=5
    open fun testss()
    {
        println("this is test function ")
    }
}

open class Persons( val name:String){

    open fun fullName(){
        println("fullname is $name")
    }
}