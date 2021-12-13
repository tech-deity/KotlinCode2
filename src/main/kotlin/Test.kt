fun main() {
//    val p=Person("vishal ", 22)
//    println("${p.name}  & ${p.age}")
//
//    val parent= Parent()
//    parent.method1()
//    parent.name = "raman"
//    println(parent.name)
//
//    val c = Child()
//    c.method1() //inheritance can be seen here
//    c.childMethod()

    val oneplus =OnePlus()
    oneplus.display()
    val simple = Phone()
   println( oneplus.toString())



}



open class Person(nameParm:String, ageParm:Int){
    var name:String=nameParm
    get() { // getter is used to get the value
        return field.toUpperCase()
    }

    var age:Int=ageParm
    set(value) { // validate the value
        if(value>0)
        {
        field=value
    }
        else{
        println("negative value is not allowed ")
        }


}
}

open class Parent{
    var name :String=""

   open  fun method1(){
        println("i am parent")
    }
}

class Child: Parent() {

    fun childMethod(){
        println(" i am child method ")
    }

//    override fun method1() {
//        print("this is override parent method ")
//    }

}

open class Phone{

    open var name:String=""
    open var size:Int= 5
    fun makeCall(){
        println("yes it can make call ")
    }
  open  fun display(){
        println("simple chinese display ")
    }

}
class OnePlus:Phone(){
    override var name: String ="One Plus"
    override var size: Int= 6
            override fun display() {
        super.display()// due to this first parent function display will be called then the child function will be

        println("one plus display here ")
    }

    override fun toString(): String {
        return "OnePlus(name='$name', size=$size)"
    }

}
