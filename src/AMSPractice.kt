import java.util.*



fun main(args: Array<String>){
    println ("Your fortune is ${getFortuneCookie(getBirthday())}")
}

fun getBirthday () : Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday : Int) : String {

    return when (birthday){
        in (1..4) -> "You will have a great day!"
        9 -> "Things will go well for you today."
        28, 31 -> "Enjoy a wonderful day of success."
        15 -> "Be humble and all will turn out well."
        in (5..8) ->"Today is a good day for exercising restraint."
        22 -> "Take it easy and enjoy life!"
        else -> "Treasure your friends because they are your greatest fortune."
    }

//    return fortunes[birthday % fortunes.size]

}
