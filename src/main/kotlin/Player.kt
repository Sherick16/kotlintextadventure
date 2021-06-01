class Player(val name: String, var life: Int = 3, var level: Int = 1, var score: Int = 0) {
    val weapon = Weapon("Fists", 10)
    val inventory = ArrayList<Loot>()


    fun show() {
        if (life < 1) {
            println("$name is dead!")
        } else {
            println("$name is alive!")
        }
    }

    override fun toString(): String {
        return """
            name:  $name
            life:  $life
            level: $level
            score: $score
            weaponName: ${weapon.name}
            weaponDmg: ${weapon.damageInflicted}
            """
    }

    fun showInventory() {
        println("$name's Inventory:")
        println(inventory.get(0))
        println("============================")
    }
}