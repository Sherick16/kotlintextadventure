class Player(name: String, hitpoints: Int, lives: Int, level: Int, dead: Boolean) : Denizens(name, hitpoints, lives, level, dead) {
    fun show() {
        if (lives < 1) {
            println("$name is dead!")
        } else {
            println("$name is alive!")
        }
    }

    fun runAway() : Boolean{
        return lives < 2
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
}