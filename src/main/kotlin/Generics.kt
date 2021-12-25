

class Container<c>(var data:c){
    fun setvalue(value:c){
        data =value
    }
    fun getvalue():c {
        return data
    }
}

fun add(vararg value :Int){
    var s=0
    for(i in value){
        s +=i
    }
    print(s)
}

fun main(){
    val ic=Container<Int>(3)
  println( ic.getvalue())
    val sc=Container<String>("Vishal")
    println(sc.getvalue())

    add(1,2,3,4,5)
}