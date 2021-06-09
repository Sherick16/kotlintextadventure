import javax.print.attribute.IntegerSyntax

fun main() {

    val gordonRamsay = Enemy("Gordon Ramsay", 15, 3, 3)
    println("Enter your character name")
    var username = readLine()

    while (username!!.isBlank()) {
        println("Please enter a valid character name")
        username = readLine()
    }
    var Player = Player("$username", 15, 1, 1)

    println("Welkom $username , \n" +
            "Jij hebt ervoor gekozen om mee te doen met een kookprogramma om aan Gordon Ramsey en de jury te laten zien dat jij geweldig kan koken en bakken!\n" +
            "Natuurlijk moet je eerst door de preliminaire komen en dat ga je doen door middel van een paar simpele vragen beantwoorden!\n" +
            "Beantwoord de volgende vraag;\n" +
            "Benoem de benodigdheden om een broodje met pindakaas te maken")
    var line : String?
    line = readLine()
    if (line == "Pindakaas"){
        println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level1'")
        println(" ")
    }
    else if (line == "Brood"){
        println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level1'")
        println(" ")
    }
    else if (line == "Mes"){
        println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level1'")
        println(" ")
    }
    else{
        Player.takeDamage(15)
        println("$username heeft 15 damage ontvangen")
        println(Player)
        println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
        System.exit(-1)
    }

    println("Voor de volgende opdracht moet je kiezen uit een meerkeuze vraag\n" +
            "Je hebt keuze uit 4 opties, beantwoord met: A, B, C of D\n" +
            "Benoem de ingrediënten om een cake te maken\n" +
            "A. roomboter, bakmeel, suiker, eieren, zout\n" +
            "B. poedersuiker, bakmeel, mixer, eieren\n" +
            "C. boter, suiker, eieren, meel, mixer, zout\n" +
            "D. roomboter , zout, melk, water, eieren, bakmeel")

    line = readLine()
    if (line == "A"){
        println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level2'")
        println(" ")
    }
    else {
        Player.takeDamage(15)
        println("$username heeft 15 damage ontvangen")
        println(Player)
        println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
        System.exit(-1)
    }

    println("De volgende opdracht bestaat weer uit een meerkeuze vraag\n" +
            "Dit keer gaan wij kijken naar de kookinstrumenten die je nodig om het maken van een cake.\n" +
            "Je hebt weer keuze uit 4 opties, beantwoord met A, B, C of D.\n" +
            "\n" +
            "A. mixer , eieren, kom, mes, pan, oven\n" +
            "B. mixer, kom, pan, zeef, oven\n" +
            "C. spatel, pan, mixer, pollepel, oven\n" +
            "D. mixer, oven, springvorm, kom")

    line = readLine()
    if (line == "D"){
        println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level3'")
    }
    else {
        Player.takeDamage(15)
        println("$username heeft 15 damage ontvangen")
        println(Player)
        println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
        System.exit(-1)
    }

    println("De volgende opdracht bestaat weer uit een meerkeuze vraag\n" +
            "Dit keer gaan wij kijken naar de ingrediënten die nodig zijn voor een goed stuk biefstuk.\n" +
            "Je hebt weer keuze uit 4 opties, beantwoord met A, B, C of D.\n" +
            "\n" +
            "A. biefstuk, zout, kaneel, thijm en boter\n" +
            "B. biefstuk, zout, peper, knoflook, thijm, boter en pinda olie\n" +
            "C. biefstuk, zout, knoflook, thijm en olijfolie\n" +
            "D. biefstuk, zout, knoflook thijm, boter en olijfolie")

    line = readLine()
    if (line == "B"){
        println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level4'")
    }
    else {
        Player.takeDamage(15)
        println("$username heeft 15 damage ontvangen")
        println(Player)
        println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
        System.exit(-1)
    }

    while(gordonRamsay.lives > 1) {
        if (Player.lives > 2) {
            println("${Player.name} is running away")
            Player.runAway()
            break
        } else {
            gordonRamsay.attack(Player, 15, 20, 10)
        }
    }
}
