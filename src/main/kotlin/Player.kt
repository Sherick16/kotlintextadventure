class Player(name: String, hitpoints: Int, lives: Int, level: Int, dead: Boolean) : Denizens(name, hitpoints, lives, level, dead) {
    val inventory = ArrayList<Loot>()

    fun show() {
        if (lives < 1) {
            println("$name is dead!")
        } else {
            println("$name is alive!")
        }
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