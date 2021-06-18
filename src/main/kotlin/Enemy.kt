open class Enemy(name: String, hitpoints: Int, lives: Int, level: Int, dead: Boolean) : Denizens(name, hitpoints, lives, level, dead){
    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitpoints, Lives: $lives"
    }
}
