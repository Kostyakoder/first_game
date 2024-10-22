package game

open class Wizard: Human(0.0 , 0, 0) {
    var heal = 0
    override fun health() {
        println("Write the health of Wizard(10-100)")
        health = readln().toDouble()
    }

    override fun special_property() {
        println("Write the heal(value) for health for each battle")
        heal = readln().toInt()
    }
    override fun add_heal() {
        health += heal
    }
    override fun power() {
        println("Write the power of Wizard(10-100)")
        power = readln().toInt()
    }

    override fun attacks() {
        println("Write the number of attacks of Wizard(1-10)")
        attacks = readln().toInt()
    }

}