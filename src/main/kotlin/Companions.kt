fun main() {
    println(Myclass.ABC.num)
    Myclass.ABC.abc()
    println(Myclass.m)
    Myclass.efg()


}
class Myclass{

    object ABC{
        @JvmStatic
        val num:Int=10
        fun abc(){
            println("this is function of object ABC")
        }
    }

    companion object DEF{
        val m:Double =22.0
        fun efg(){
            println("this is function of companion object ")
        }

    }

    object MK{

    }
}