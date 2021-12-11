fun main() {

    println(A.name)
    B.Test()

    //this is object expression
    var testOBj =object{
        init {
            println("this is object expression")
        }

        val x :Int =10

        fun abc(x:Int,y:Int) :Int{
            return x+y
        }

    }

    println(testOBj.abc(22,3))

    val testObj2 = object : ABCE() {

        override fun abce() {
           println("i am object ABCE")
        }


    }

    val testObj3 =object :Clonnable{

        override fun clone() {
            super.clone()
        }

    }
}

//this is called Object Declaration
object A {


    init {
        println("we are studying Object Declaration ")
    }
    val name:String ="Vishal Kumar"

}
object B{

    val name:String="Kumar"

    fun Test(){
        println("I am Objects")
    }
}

open class ABCE{

    val n :String ="Vishalaaaaa"

    open  fun abce(){
        println("i am class methood")
    }
}
interface Clonnable{

     fun clone (){

        println("clonnnable interface ")
    }
}