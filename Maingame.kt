package game

import kotlin.math.round

fun main() {
    val robot = Robot()
    val wizard = Wizard()
    val knight = Knight()

    println("Robot : ")
    robot.health()
    robot.special_property()
    robot.power()
    robot.attacks()

    println("Wizard : ")
    wizard.health()
    wizard.special_property()
    wizard.power()
    wizard.attacks()

    println("Knight : ")
    knight.health()
    knight.power()
    knight.special_property()
    knight.attacks()

    val b1 = Battle()
    b1.round(robot, wizard, knight)
}

