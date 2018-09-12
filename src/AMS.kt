import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}!")
    feedTheFish()

    println(fitMoreFish(10.0,listOf(3,3,3)))
    println(fitMoreFish(8.0,listOf(2,2,2), hasDecorations = false))
    println(fitMoreFish(9.0,listOf(1,1,3),3))
    println(fitMoreFish(10.0, listOf(),7,true))

}

fun feedTheFish (){
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food");
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String{

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "stuffs"
//        "Thursday" -> "other stuffs"
//        "Friday" -> "more stuffs"
//        "Saturday" -> "thingies"
//        "Sunday" -> "bats"
        else -> "fasting"
    }
}

fun fitMoreFish(tankSize : Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean {

    val maxFishSpace = if (hasDecorations) tankSize * .80 else tankSize
    val remainingFishSpace = maxFishSpace - currentFish.sum()
    return fishSize <= remainingFishSpace
}

