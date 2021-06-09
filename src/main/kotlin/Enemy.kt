class Enemy(name: String, hitpoints: Int, lives: Int, level: Int) : Denizens(name, hitpoints, lives, level){
    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitpoints, Lives: $lives"
    }
}