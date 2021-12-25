class Cir(val radius:Double){

    fun areas():Double{
        return Math.PI*radius*radius
    }
}

fun Cir.Perimeter():Double{
    return 2*Math.PI*radius
}

fun main() {
    println("Parimeter of Circle is ${Cir(3.0).Perimeter()}")
}