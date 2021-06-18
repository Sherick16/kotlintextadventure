open class Denizens(val name: String, var hitpoints: Int, var lives: Int, var level: Int, var dead: Boolean) {
    val weapon = Weapon("Fists", 10)
    open fun takeDamage(weapon: Weapon) {
        var damage = weapon.damageInflicted
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0) {
            hitpoints = remainingHitpoints
            println("$name took $damage points of damage and has $hitpoints left.")

        } else {
            hitpoints = remainingHitpoints
            if (lives > 1) {
                lives -= 1
                println("$name has lost a life")
            } else {
                println("$name is dead! $name has no more lives left")
            }
        }
    }

    //    open fun attack(player: Player, minDamage: Int, maxDamage: Int, attackTurns: Int) {
//
//        var numberOfAttacks = attackTurns
//        while (numberOfAttacks != 0) {
//            val attackDamage = (minDamage..maxDamage).random()
//            player.takeDamage(attackDamage)
//            println("${player.name}'s took $attackDamage points of damage!")
//            numberOfAttacks -= 1
//            Thread.sleep(800)
//        }
//    }

    override fun toString(): String {
        return """
            name:  $name
            life:  $lives
            level: $level
            hitpoints: $hitpoints
            """
    }
    fun penis(): String {
        return """
            name:  $name
            life:  $lives
            level: $level
            hitpoints: $hitpoints
            """
    }
}