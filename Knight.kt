package game

open class Knight(): Human(0.0,0,0) {
    var add_power=0
    override fun health() {
        println("Write the health of Knight(10.0-100.0)")
        health = readln().toDouble()
    }

    override fun power() {
        println("Write the power of Knight(10-100)")
        power = readln().toInt()
    }

    override fun special_property() {
        println("Write the value of the addition of Knight for power(1%-100%)")
        add_power = readln().toInt()
        power+=add_power
    }

    override fun attacks() {
        println("Write the number of attacks of Knight(1-10)")
        attacks = readln().toInt()
    }

    override fun add_heal() {
        health += 0
    }
}