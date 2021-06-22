open class Denizens(var name: String, var hitpoints: Int, var lives: Int, var level: Int, var dead: Boolean) : Colours() {
    open fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0) {
            hitpoints = remainingHitpoints
            println("$RED $name took $damage points of damage and has $hitpoints left. $RESET")
        } else {
            if (lives < 1) {
                lives -= 1
                println("$RED $name has lost a life $RESET")
            } else {
                lives -= 1
                println("$RED $name is dead! $name has no more lives left $RESET")
            }
        }
    }

    open fun attack(denizens: Denizens, minDamage: Int, maxDamage: Int) {
        val attackDamage = (minDamage..maxDamage).random()
        denizens.takeDamage(attackDamage)
        Thread.sleep(1000)
    }
}