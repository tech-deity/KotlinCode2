fun main() {

    val p1= Pers("vishal",1)
    val p2= Pers("ram",2)
    val p3= Pers("Rahul",33)
    val p4= Pers("vishal",1)

    println(p1)
    println(p2.hashCode())
    println(p1 == p4)
    val p5 =p3.copy()
    println(p5)
    val(id,name) =p1
    println(id)
    println(name)
    println(p3.component2())

}

data class Pers(val name:String,
                val age:Int)