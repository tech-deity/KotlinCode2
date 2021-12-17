fun main() {
    var gender :String ="male"
    var gender2:String? =null
    var isAdult:Boolean?=true

    if(gender!==null)
    {
        gender.toUpperCase()
    }
    println(gender2?.toUpperCase())

    gender2?.let{
        println("Line 1")
        println("line 2 $gender2")
        println("line3 $it")

    }

    var selected :String? = gender2
    var selectedValue=gender2?:"NA"
    

}