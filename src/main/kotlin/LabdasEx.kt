fun main() {
    val v=sum(2,8)
    println("normal function $v")
   val c= calc(2,5) { a, b -> a + b }
    println(c)
    println(m(12))



}

fun sum(a:Int,b:Int):Int=a+b
fun mul(a:Int,b:Int):Int=a*b
val m:(Int)->Int={x->x*x}
val x:(Int)->Int={it+it}


fun calc(a:Int,b:Int,op:(Int,Int)->Int):Int{
    return op(a,b)
}