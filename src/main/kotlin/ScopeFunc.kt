data class Employ(var name:String="",var age:Int=1)
class Employess{
    var firstName:String?=null
    var age:Int=0
}
fun main() {
    val emp=Employ()
    val emp1 :Employess?=Employess()
    emp1?.let {
        print(it.age)
    }


    val emp2:Employ?=null
    emp2?.let {
        it.age=33
        it.name="Kumar"
    }

    println(emp2)

    emp.name="Vishal"
    emp.age=22
    emp.apply {
        age=30
        name="ravi"

    }

    with(emp){
        age=44
        name="SSS"
    }

    emp.run {
        age=345
        name="ravi kumar"
    }
    println(emp)



}