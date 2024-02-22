fun main(){
    greet( "Hope")
    println(modulus(60, 23))
    println(addition(44, 85,76, 65 ))

    interestingFact("I", "love","playing", "board", "games")



}
fun greet( name: String){
    var name= "Hello ${name}"
    println(name)
}

fun modulus(num1: Int, num2: Int): Int{
    var res = num1 % num2
    return res
}

fun addition(num4: Int, num5: Int, num6: Int, num7: Int): Int{
    var res= num4 + num5 + num6 + num7
    return res
}
fun interestingFact(fact1: String, fact2: String, fact3: String, fact4: String, fact5: String){
    var res = fact1+ " "+fact2+ " "+fact3+" "+fact4+" "+ fact5
    println(res)
}