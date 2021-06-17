class Player(name: String, hitpoints: Int, lives: Int, level: Int) : Denizens(name, hitpoints, lives, level) {
    val inventory = ArrayList<Loot>()


    fun show() {
        if (lives < 1) {
            println("$name is dead!")
        } else {
            println("$name is alive!")
        }
    }

    override fun toString(): String {
        return """
            name:  $name
            life:  $lives
            level: $level
            hitpoints: $hitpoints
            weaponName: ${weapon.name}
            weaponDmg: ${weapon.damageInflicted}
            """
    }

    fun showInventory() {
        println("$name's Inventory:")
        println(inventory.get(0))
        println("============================")
    }



    fun runAway() : Boolean{
        return lives < 2
    }
}