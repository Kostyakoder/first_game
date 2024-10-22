package game

class Robot: Human(0.0, 0, 0) {
    var percents = 0.0
    var protection = 0

    override fun health() {
        println("Write the health of Robot(10.0-100.0)")
        health = readln().toDouble()
    }

    override fun special_property() {
        println("Write the percents of the protection(0%-100%)")
        protection = readln().toInt()
        percents = health*protection/100.0
        health += percents
    }

    override fun power() {
        println("Write the power of Robot(10-100)")
        power = readln().toInt()
    }

    override fun attacks() {
        println("Write the number of attacks of Robot(1-10)")
        attacks = readln().toInt()
    }
    override fun add_heal() {
        health += 0
    }
}