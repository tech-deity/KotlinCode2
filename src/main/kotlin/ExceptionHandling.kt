fun main() {
    var arr =arrayOf(1,2,3)
    try{
        println(arr[5])
    }catch (e:Exception){

        println("please check the array index")

    }
    finally {
        println("i will execute no matter try or catch works ")
    }
}