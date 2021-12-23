import java.lang.Math.pow
import kotlin.math.pow

fun main() {
    var fn: (a: Int, b: Int) -> Int =::sum_1
    val lamda1 ={x:Int,y:Int->x+y}// lambda function are function which has no name
    val multilinelambda ={
        println("HEllo multi line Lambda")
        2
    }
  //  println(cal(1,2,::sum_1)) //  since sum_1 and cal both have function with sametype of function and return type so we can use it

 val singleparam ={x:Int->x*x}
    val lamb2:(Int)->Int={x->x*x}
    val lamb3:(Int)->Int={x->x+x}
    val simple:(Int)->Int={it+it}

    cal(3,4) { a, b -> a + b }
  val cc=  cal(4,3){a,b-> a.times(b)}
    println(cc)
    val cd = cal2(2.0,3.0){a,b-> a.pow(b)}

    println(cd)
}

fun sum_1(a:Int,b:Int) :Int=a+b

fun cal(a:Int,b:Int,op:(Int,Int)->Int):Int{
// this is higher order function since its accept function as argument
// .. and an higher order function are the function which accept  and return function

    return op(a,b)
}
fun cal2(a:Double,b:Double,ss:(Double,Double)->Double):Double{
    return ss(a,b)
}


