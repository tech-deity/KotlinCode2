abstract class Shape{
    var name :String=""
    abstract fun area():Double
    abstract fun display()
}

class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }

    override fun display() {
        println("this is circle ")
    }

}

class Triangle(val height:Double, val base:Double):Shape(){
    override fun area(): Double {
        return 0.5*height*base
    }

    override fun display() {
        println("this is triangle")
    }

}
fun main() {
 val circle = Circle(5.0)
 println(circle.area())
 circle.display()
}