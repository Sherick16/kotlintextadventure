open class Enemy(val name: String, var hitpoints: Int, var lives: Int) {
    fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0) {
            hitpoints = remainingHitpoints
            println("$name took $damage points of damage and has $hitpoints left.")
        } else {
            lives -= 1
            println("$name lost a life.")
        }
        if (lives < 1){
            hitpoints = 0
            println("$name has lost.")
        }
    }
    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitpoints, Lives: $lives"
    }
}