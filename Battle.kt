package game

class Battle {
    fun round(player1: Human, player2: Human, player3: Human) {
        while (player1.health>0 && player2.health>0 && player3.health>0) {
            player2.add_heal()
            if (player2.attacks>0) {
                player1.damage(player2.power)
                player2.attacks -= 1
            }

            if (player1.health <= 0) {
                println("What's a hell!! Robot is dead")
                println("The health of Wizard = ${player2.health}")
                println("The health of Knight = ${player3.health}")
                break
            }
            if (player1.attacks>0) {
                player3.damage(player1.power)
                player1.attacks -= 1
            }

            if (player3.health <= 0) {
                println("What's a hell!! Knight is dead")
                println("The health of Robot = ${player1.health}")
                println("The health of Wizard = ${player2.health}")
                break
            }

            if (player3.attacks>0) {
                player2.damage(player3.power)
                player3.attacks -= 1
            }

            if (player2.health <= 0) {
                println("What's a hell!! Wizard is dead")
                println("The health of Robot = ${player1.health}")
                println("The health of Knight = ${player3.health}")
                break
            }

            if (player1.attacks==0 && player2.attacks==0 && player3.attacks==0) {
                println("The health of Robot = ${player1.health}")
                println("The health of Wizard = ${player2.health}")
                println("The health of Knight = ${player3.health}")
                break
            }

        }

    }


}