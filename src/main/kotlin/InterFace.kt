
interface Draggable{
    fun drag()
}

abstract  class Shapes :Draggable {
    abstract fun areas():Double
    abstract override fun drag()
}
class Circles(val radius:Double) :Shapes(){


    override fun areas(): Double {
        return  Math.PI*radius*radius
    }


    override fun drag() {

        println("circle is dragging ")
    }

}

 class Triangles(val radius:Double) :Shapes(){


     override fun areas(): Double {
         return  Math.PI*radius*radius
     }

     override fun drag() {

         println("triangle is dragging")
    }


}

class player (val name:String ):Draggable{

    fun saymyName()=println("may name is $name")
    override fun drag() {
        println("player is dragging ")
    }

}

class Test{

}

fun main() {
    val c = Circles(33.0)
   // c.drag()

    val p= player("ravi")
// this is type checking

    if(c is Draggable){
        println(c.areas())
    }



    val arr = arrayOf(c, p, Test()) // here the smart casting is performed where the arr was first Circle type then changed to player type
    for(obj in arr){
        if(obj is Circles){
            println(obj.drag())
        }
        else{
            (obj as player).saymyName()
        }

}
}




