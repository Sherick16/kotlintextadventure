class Levels(val name: String, var levelCompletion: Boolean){
// Initialiseer alle nodige variabele die alle classes gemeen hebben
        var username = ""
        val player = Player("$username", 15, 1, 0)
        var line = readLine()!!.toLowerCase()
        val gordonRamsay = Enemy("Gordon Ramsay", 120, 1, 3)
        val amateurChef = Enemy("Amateur Chef Henk", 15, 1, 3)
        val jamieOliver = Enemy("Jamie Oliver", 15, 1, 3)
        val alainDucasse = Enemy("Alain Ducasse", 15, 1, 3)
        val joeBastianich = Enemy("Joe Bastianich", 15, 1, 3)

        open fun charSelect() {
            println("Enter your character name")
            username = readLine().toString()

            while (username.isBlank()) {
                println("Please enter a valid character name")
                username = readLine().toString()
            }

            val player = Player("$username", 15, 1, 0)
            println(player)
            var line: String?
        }

        fun level0() : Boolean{
            println(
                "Welkom $username , \n" +
                        "Jij hebt ervoor gekozen om mee te doen met een kookprogramma om aan Gordon Ramsey en de jury te laten zien dat jij geweldig kan koken en bakken!\n" +
                        "Natuurlijk moet je eerst door de preliminaire komen en dat ga je doen door middel van een paar simpele vragen beantwoorden!\n" +
                        "Beantwoord de volgende vraag;\n" +
                        "Benoem de benodigdheden om een broodje met pindakaas te maken"
            )

            if (line == "pindakaas" || line == "brood" || line == "mes") {
                println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level1'")
                line = readLine().toString()
                if (line == "level1") {
                    //Code for level1
                }
                println(" ")
            } else {
                player.takeDamage(15)
                println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
                System.exit(-1)
            }
            return true
            level1()
        }

        fun level1() :Boolean {
            println(
                "Voor de volgende opdracht moet je kiezen uit een meerkeuze vraag\n" +
                        "Je hebt keuze uit 4 opties, beantwoord met: A, B, C of D\n" +
                        "Benoem de ingrediënten om een cake te maken\n" +
                        "A. roomboter, bakmeel, suiker, eieren, zout\n" +
                        "B. poedersuiker, bakmeel, mixer, eieren\n" +
                        "C. boter, suiker, eieren, meel, mixer, zout\n" +
                        "D. roomboter , zout, melk, water, eieren, bakmeel"
            )


            if (line == "a") {
                println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level2'")
                line = readLine().toString()
                if (line == "level2") {
                    //Code for level2
                }
                println(" ")
            } else {
                player.takeDamage(15)
                println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
                System.exit(-1)
            }
            return true
            level2()
        }

        fun level2() : Boolean {
            println(
                "De volgende opdracht bestaat weer uit een meerkeuze vraag\n" +
                        "Dit keer gaan wij kijken naar de kookinstrumenten die je nodig om het maken van een cake.\n" +
                        "Je hebt weer keuze uit 4 opties, beantwoord met A, B, C of D.\n" +
                        "\n" +
                        "A. mixer , eieren, kom, mes, pan, oven\n" +
                        "B. mixer, kom, pan, zeef, oven\n" +
                        "C. spatel, pan, mixer, pollepel, oven\n" +
                        "D. mixer, oven, springvorm, kom"
            )

            line = readLine()!!.toLowerCase()
            if (line == "d") {
                println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level3'")
                line = readLine().toString()
                if (line == "level3") {
                    //Code for level3
                }
                println(" ")
            } else {
                player.takeDamage(15)
                println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
                System.exit(-1)
            }
            return true
            level3()
        }

        fun level3() : Boolean{
            println(
                "De volgende opdracht bestaat weer uit een meerkeuze vraag\n" +
                        "Dit keer gaan wij kijken naar de ingrediënten die nodig zijn voor een goed stuk biefstuk.\n" +
                        "Je hebt weer keuze uit 4 opties, beantwoord met A, B, C of D.\n" +
                        "\n" +
                        "A. biefstuk, zout, kaneel, thijm en boter\n" +
                        "B. biefstuk, zout, peper, knoflook, thijm, pinda olie en boter\n" +
                        "C. biefstuk, zout, knoflook, thijm en olijfolie\n" +
                        "D. biefstuk, zout, knoflook thijm, boter en olijfolie"
            )

            line = readLine()!!.toLowerCase()
            if (line == "b") {
                println("Dat is het goede antwoord je mag nu door naar het volgende level! Type in 'level4'")
                line = readLine().toString()
                if (line == "level4") {
                    //Code for level4
                }

            } else {
                player.takeDamage(15)
                println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
                System.exit(-1)
            }
            return true
            level4()
        }

        fun level4() : Boolean{

            println(
                "Oh nee! Het lijkt  erop dat er iets niet goed gemaakt is bij één van de andere kandidaten waardoor de andere deelnemers en de jury op hol zijn  geslagen! \n" +
                        "Probeer  jezelf te verdedidgen tegen andere deelnemers en de jury!"
            )
            println("Uitleg combat; wortel, pan, ren")

            while (amateurChef.lives >= 1) {
                line = readLine()!!.toLowerCase()
                if (line == "wortel") {
                    amateurChef.takeDamage(15)
                    if (amateurChef.lives >= 0) {

                    }
                } else if (line == "pan") {
                    println("$username heeft zichzelf met een pan verdedigd... Maar het is een mini-pan!")
                    player.takeDamage(5)
                } else if (line == "ren") {
                    println("$username probeerde weg te rennen maar is in zijn rug gestoken met een wortel!")
                    player.takeDamage(15)
                } else {
                    println("Error, onjuiste input...")
                }
                println("Goed gedaan! Je hebt de tegenstander verslagen en hebt  zijn wapen overgenomen! Nu kan hiermee jezelf verdedidgen tegen de anderen")
            }
            return true
        }
}