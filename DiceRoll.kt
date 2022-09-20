fun main(){
    val firstDice = Dice(6)
    val rollResult = firstDice.roll()
    when (rollResult){
        1-> println("1")
        2-> println("2")
        3-> println("3")
        4-> println("4")
        5-> println("5")
        6-> println("6")
    }
}

class Dice(val sides: Int){
    fun roll(): Int{
        return(1..sides).random()
    }
}
