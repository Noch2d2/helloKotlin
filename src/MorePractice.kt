

fun main (args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood:String, weather:String = "sunny", temperature:Int = 24):String{
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        weather == "smoky" -> "BBQ time"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}