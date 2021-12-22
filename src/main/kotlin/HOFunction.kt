import kotlin.math.pow

fun main() {

    var fn: (a: Double, b: Double) -> Double = :: sum
    var fn1:(a:Double,b:Double) -> Double =::powerr
    println(fn(2.0,2.0))
    calculators(5.0,5.0,::sum)


}

fun sum(a:Double, b:Double):Double{

    return a+b
}
fun powerr(a:Double ,b:Double):Double{

    return a.pow(b)

}
fun calculators(a:Double,b:Double,gn:(Double,Double)->Double){
    val result =gn(a,b)
    println(result)
}