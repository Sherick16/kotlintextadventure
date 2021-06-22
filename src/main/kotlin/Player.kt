class Player(name: String, hitpoints: Int, lives: Int, level: Int, dead: Boolean) : Denizens(name, hitpoints, lives, level, dead) {
    val weapon = Weapon("Fists", 1000, 1500)
    val inventory = ArrayList<Loot>()

    fun show() {
        if (lives < 1) {
            println("$name is dead!")
        } else {
            println("$name is alive!")
        }
    }

    fun showInventory() {
        println("$name$BLUE's Inventory:$RESET")
        for (item in inventory) {
            println("$CYAN name: ${item.name} || value: ${item.value}$RESET")
        }
        println("$BLUE============================$RESET")
    }

    override fun toString(): String {
        return """
            name:  $name
            life:  $lives
            level: $level
            hitpoints: $hitpoints
            loot: $inventory
            """
    }
    fun dead(dead: Boolean) {
        System.exit(1)
    }
}