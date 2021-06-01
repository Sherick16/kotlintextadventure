import com.sun.jdi.DoubleValue

enum class LootType{
    POTION, RING, ARMOR
}

class Loot(val name: String, val lootType: LootType, val value: DoubleValue){

}