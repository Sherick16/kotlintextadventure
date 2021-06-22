class GordonRamsay(name: String, hitpoints: Int, lives: Int, level: Int, dead: Boolean) : Enemy(name, hitpoints, lives, level, dead) {
    val weapon = Weapon("Fists", 1000, 1500)
}