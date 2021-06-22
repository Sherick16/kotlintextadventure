enum class LootType{
    RANDOMSTUFF, WEAPONS, ARMOR
}

class Loot(val name: String, val lootType: LootType, val value: Int){

}