package game

abstract class Human(var health:Double, var power:Int, var attacks: Int) {
//    var health: Int = health
//    var power: Int = power

    abstract fun health()

    abstract fun power()

    abstract fun attacks()

    abstract fun special_property()

    abstract fun add_heal()

    fun damage(powerEnemie: Int) {
        health-=powerEnemie
    }


}