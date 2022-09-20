fun main(){
    val coinToss = Coin()
    val flipResult = coinToss.flip()
    when(flipResult){
        1-> println("Heads")
        2-> println("Tails")
    }
}
class Coin(){
    fun flip(): Int{
        return (1..2).random()
    }
}
