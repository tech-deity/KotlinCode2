sealed class  Employee


data class Manager(val name:String,val age :Int,val team:List<String>):Employee()
class SenirDev(val name: String,val age: Int,val projects:Int):Employee()
object JuniorDev:Employee(){
   init {
       println("this is init block inside the object ")
   }
    val nameobj:String="Vishal Kumar"
}

fun main() {
    val emp:Employee=SenirDev("Name",33,5)
    println("name of the junior developer is ${JuniorDev.nameobj}")

    val message:String = when (emp){

        is Manager -> {"welcome  ${emp.name} you have ${emp.team.size} people in your team"}
        is SenirDev -> {"welcome dear ${emp.name} you have ${emp.projects} in your resume "}
        JuniorDev -> {"hey welcome to the group dear "}
    }
    println(message)
}