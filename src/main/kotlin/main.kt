import javax.print.attribute.IntegerSyntax

fun main() {

    val gordonRamsay = Enemy("Gordon Ramsay", 15, 9)
    println(gordonRamsay)

    gordonRamsay.takeDamage(5)
    println(gordonRamsay)

    val uglyTroll = Troll("Troll", 30, 1)
    println(uglyTroll)

    uglyTroll.takeDamage(30)
    println(uglyTroll)
}