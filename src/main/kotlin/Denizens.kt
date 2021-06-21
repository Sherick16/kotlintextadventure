open class Denizens(val name: String, var hitpoints: Int, var lives: Int, var level: Int, var dead: Boolean) {
    val inventory = ArrayList<Loot>()
    val weapon = Weapon("Fists", 10)
    open fun takeDamage(weapon: Weapon) {
        var damage = weapon.vardamageInflicted
        var remainingHitpoints = hitpoints - damage
        hitpoints = remainingHitpoints
        if (remainingHitpoints > 0) {
            hitpoints = remainingHitpoints
            println("$name took $damage points of damage and has $hitpoints left.")
        } else {
            if (lives < 1) {
                lives -= 1
                println("$name has lost a life")
            } else {
                println("$name is dead! $name has no more lives left")
                lives -= 1
            }
        }
    }

    fun showInventory() {
        println("============================")
        println("$name's Inventory:")
        for (item in inventory) {
            println("name: ${item.name} || value: ${item.value}")
        }
        println("============================")
    }

//        open fun attack(player: Player, minDamage: Int, maxDamage: Int, attackTurns: Int) {
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
}