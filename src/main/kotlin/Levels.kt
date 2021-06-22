class Levels() {
    // Initialiseer alle nodige variabele die alle classes gemeen hebben
    var username = ""
    val fists = Weapon("Fists", 1500)
    val Nametag = Loot("nametag", LootType.RANDOMSTUFF, 1)
    fun levels(): Boolean {
        //========================================================//
        //====================CHAR SELECT=========================//
        //========================================================//
        println("Enter your first name name")
        var firstname = readLine()

        while (firstname!!.isBlank()) {
            println("Please enter a valid first name")
            firstname = readLine()
        }
        println("Enter your last name name")
        var lastname = readLine()

        while (lastname!!.isBlank()) {
            println("Please enter a valid last name")
            lastname = readLine()
        }

        var username = "$firstname $lastname"
        val player = Player("$username", 15, 1, 0, false)
        println(player)
        player.inventory.add(Nametag)
        player.showInventory()
        //========================================================//
        //======================LEVEL 0===========================//
        //========================================================//
        val broodjepindakaas = Loot("broodje pindakaas", LootType.RANDOMSTUFF, 1)
        println(
            "Welkom $username , \n" +
                    "Jij hebt ervoor gekozen om mee te doen met een kookprogramma om aan Gordon Ramsey en de jury te laten zien dat jij geweldig kan koken en bakken!\n" +
                    "Natuurlijk moet je eerst door de preliminaire komen en dat ga je doen door middel van een paar simpele vragen beantwoorden!\n" +
                    "Beantwoord de volgende vraag;\n" +
                    "Benoem de benodigdheden om een broodje met pindakaas te maken"
        )
        var line : String?
        line = readLine()!!.toLowerCase()
        if (line == "pindakaas" || line == "brood" || line == "mes") {
            println("Dat is het goede antwoord je mag nu door naar het volgende level!")
            println(" \n ")
        } else {
            player.takeDamage(fists)
            println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
            System.exit(-1)
        }
        player.inventory.add(broodjepindakaas)
        player.showInventory()
        //========================================================//
        //======================LEVEL 1===========================//
        //========================================================//
        val cake = Loot("cake", LootType.RANDOMSTUFF, 1)
        println(
            "Voor de volgende opdracht moet je kiezen uit een meerkeuze vraag\n" +
                    "Je hebt keuze uit 4 opties, beantwoord met: A, B, C of D\n" +
                    "Benoem de ingrediënten om een cake te maken\n" +
                    "A. roomboter, bakmeel, suiker, eieren, zout\n" +
                    "B. poedersuiker, bakmeel, mixer, eieren\n" +
                    "C. boter, suiker, eieren, meel, mixer, zout\n" +
                    "D. roomboter , zout, melk, water, eieren, bakmeel \n"
        )
        line = readLine()!!.toLowerCase()
        if (line == "a") {
            println("Dat is het goede antwoord je mag nu door naar het volgende level!")
            println(" \n ")
        } else {
            player.takeDamage(fists)
            println("Je hebt jezelf vergiftigd.")
            System.exit(-1)
        }

        player.inventory.add(cake)
        player.showInventory()

        //========================================================//
        //======================LEVEL 2===========================//
        //========================================================//
        val pizza = Loot("pizza", LootType.RANDOMSTUFF, 1)
        println(
            "De volgende opdracht bestaat weer uit een meerkeuze vraag\n" +
                    "Dit keer gaan wij kijken naar de kookinstrumenten die je nodig voor het maken van een pizza.\n" +
                    "Je hebt weer keuze uit 4 opties, beantwoord met A, B, C of D.\n" +
                    "\n" +
                    "A. deegroller, oven, salami, tomatensaus \n" +
                    "B. deegroller, oven, spatel \n" +
                    "C. deegroller, deeg, spatel \n" +
                    "D. deegroller, oven, kom \n"
        )
        line = readLine()!!.toLowerCase()
        if (line == "d") {
            println("Dat is het goede antwoord je mag nu door naar het volgende level!\n")
            println(" \n")
        } else {
            player.takeDamage(fists)
            println("Helaas je hebt het niet gehaald, probeer het een andere keer weer. \n")
            System.exit(-1)
        }
        player.inventory.add(pizza)
        player.showInventory()

        //========================================================//
        //======================LEVEL 3===========================//
        //========================================================//
        val biefstuk = Loot("biefstuk", LootType.RANDOMSTUFF, 1)

        println(
            "De volgende opdracht bestaat weer uit een meerkeuze vraag\n" +
                    "Dit keer gaan wij kijken naar de ingrediënten die nodig zijn voor een goed stuk biefstuk.\n" +
                    "Je hebt weer keuze uit 4 opties, beantwoord met A, B, C of D.\n" +
                    "\n" +
                    "A. biefstuk, zout, kaneel, thijm en boter\n" +
                    "B. biefstuk, zout, peper, knoflook, thijm, pinda olie en boter\n" +
                    "C. biefstuk, zout, knoflook, thijm en olijfolie\n" +
                    "D. biefstuk, zout, knoflook thijm, boter en olijfolie\n"
        )
        line = readLine()!!.toLowerCase()
        if (line == "b") {
            println("Dat is het goede antwoord je mag nu door naar het volgende level!\n")
            println(" \n")
        } else {
            player.takeDamage(fists)
            println("Helaas je hebt het niet gehaald, probeer het een andere keer weer.")
            System.exit(-1)

        }
        player.inventory.add(biefstuk)
        player.showInventory()

        //========================================================//
        //======================LEVEL 4===========================//
        //========================================================//
        val amateurChef = Enemy("Amateur Chef Henk", 15, 1, 4, false)
        val wortel = Weapon("Fists", 0)
        val mes = Weapon("Mes", 5)
        val amateurMes = Loot("AmateurChef's Mes", LootType.RANDOMSTUFF, 1)
        println(
            "Oh nee! Het lijkt  erop dat er iets niet goed gemaakt is bij één van de andere kandidaten waardoor de andere deelnemers en de jury op hol zijn  geslagen! \n" +
                    "Probeer  jezelf te verdedidgen tegen andere deelnemers en de jury!\n"
        )
        println(
            "Je ziet in je ooghoek een wortel en een mini-pan! Je pakt ze snel op. \n" + "Gefeliciteerd je hebt een 'wortel' en een 'mini-pan' aan je inventory toegevoegd! \n" +
                    "Waar kies je voor? 'Vuist', 'mini-pan' of 'rennen'?"
        )
        print(" \n ")

        while (amateurChef.lives >= 1 && player.lives >= 1) {
            line = readLine()!!.toLowerCase()
            if (line == "vuist") {
                println("$username heeft ${amateurChef.name} in 1 klap verslagen")
                amateurChef.takeDamage(fists)
                print(" \n ")
            } else if (line == "mini-pan") {
                println("$username heeft zichzelf met een pan verdedigd... Maar het is een mini-pan!")
                player.takeDamage(mes)
                print(" \n ")
            } else if (line == "rennen") {
                println("$username probeerde weg te rennen maar is in zijn rug gestoken met een wortel!")
                player.takeDamage(mes)
                print(" \n ")
            } else {
                println("Error, onjuiste input...")
                print(" \n ")
            }
            print(" \n ")
        }
        println("Jo wat insane! Je hebt de amateurchef in 1 klap verslagen!")
        player.inventory.add(amateurMes)
        player.showInventory()

        //========================================================//
        //======================LEVEL 5===========================//
        //========================================================//
        print(" \n ")
        val jamieOliver = Enemy("Jamie Oliver", 25, 1, 5, false)
        val michelinStar = Loot("Michelin Star", LootType.RANDOMSTUFF, 1000)

        print(
            "Je hebt de amateur chef verslagen maar nu staat één van de juryleden  voor je omdat hij denkt dat jij ook één van de losgeslagen deelnemers bent. \n" +
                    "Zorg ervoor dat hij jou niet kan pakken en versla hem voordat hij jou verslaat! "
        )
        print(
            "Je kijkt snel rond en je ziet niks liggen wat je kan gebruiken. \n" + "Maar je beseft ook dat je niet veel meer nodig hebt dan je vuist! \n" +
                    "Waar kies je voor? 'Vuist', 'afweren', 'mini-pan' of 'rennen'?"
        )
        print(" \n ")

        while (jamieOliver.lives >= 1 && player.lives >= 1) {
            line = readLine()!!.toLowerCase()
            if (line == "vuist") {
                println("$username heeft ${jamieOliver.name} in 1 klap verslagen!")
                jamieOliver.takeDamage(fists)
                print(" \n ")
            } else if (line == "mini-pan") {
                println("$username heeft zichzelf geprobeerd te verdedigen met een mini-pan! Helaas heeft Jamie Oliver een geweer en schiet hij je in je hoofd!")
                player.takeDamage(fists)
                print(" \n ")
            } else if (line == "rennen") {
                println("$username probeerde weg te rennen maar werd doodgeschoten door Jamie Olivir!")
                player.takeDamage(fists)
                print(" \n ")
            } else {
                println("Error, onjuiste input...")
                print(" \n ")
            }
        }
        println(
            "Je hebt zijn michelin sterren van zijn borst afgrukt en jouw eigen gemaakt! \n" +
                    "Dit was al je 2de tegenstander die je hebt verslagen met 1 klap! Je besluit vol zelfvertrouwen meer tegenstanders op te zoeken"
        )
        println(" ")
        player.inventory.add(michelinStar)
        player.showInventory()

        //========================================================//
        //======================LEVEL 6===========================//
        //========================================================//
        print(" \n ")
        val alainDucasse = Enemy("Alain Ducasse", 15, 1, 6, false)
        val honkbalknuppel = Loot("Honkbal Knuppel", LootType.RANDOMSTUFF, 10)
        val jas = Loot("jas", LootType.RANDOMSTUFF, 2)


        print("Je ziet het volgende jury lid al staan!")
        print(
            "Je loopt op hem af, maar dan zie je dat Alain Ducasse een honkbal knuppel in zijn hand heeft! \n +" +
                    "Waar kies je voor? 'Vuist', 'afweren', 'mini-pan' of 'rennen'?"
        )
        print(" \n ")

        while (alainDucasse.lives >= 1 && player.lives >= 1) {
            line = readLine()!!.toLowerCase()
            if (line == "afweren") {
                println("$username heeft zich geprobeerd af te schermen, maar dat is je niet gelukt en Alain Ducasse slaat je op je harses.")
                player.takeDamage(fists)
                print(" \n ")
            } else if (line == "mini-pan") {
                println("$username heeft zichzelf geprobeerd te verdedigen met een mini-pan! Helaas heeft Alain Ducasse een geweer en schiet je in je hoofd!")
                player.takeDamage(fists)
                print(" \n ")
            } else if (line == "rennen") {
                println("$username probeerde weg te rennen maar je bent te dik en daardoor wordt je ingehaald door Alain Ducasse die jou op je harses slaat.")
                player.takeDamage(fists)
                print(" \n ")
            } else if (line == "vuist") {
                println("$username heeft ${alainDucasse.name} weer in 1 klap verslagen!")
                alainDucasse.takeDamage(fists)
                print(" \n ")
            } else {
                println("Error, onjuiste input...")
                print(" \n ")
            }
        }
        println("Je hebt als trophy zijn jas en honkbalknuppel afgepakt om te laten zien wie de échte baas is!")
        player.inventory.add(jas)
        player.inventory.add(honkbalknuppel)
        player.showInventory()
        print(" \n ")

        //========================================================//
        //======================LEVEL 7===========================//
        //========================================================//
        print(" \n ")
        val joeBastianich = Enemy("Joe Bastianich", 15, 1, 7, false)
        val scheerMes = Loot("Moeder Bastianich's scheermes", LootType.RANDOMSTUFF, 5000)

        print("Je ziet het volgende jury lid al staan!")
        print("Waar kies je voor? 'Vuist', 'afweren', 'mini-pan' of 'rennen'")
        print(" \n ")

        while (joeBastianich.lives >= 1 && player.lives >= 1) {
            line = readLine()!!.toLowerCase()
            if (line == "afweren") {
                println("$username word geschoten in zijn borst en gaat later daardoor dood aan kanker.")
                player.takeDamage(fists)
                print(" \n ")
            } else if (line == "mini-pan") {
                println("$username x")
                player.takeDamage(fists)
                print(" \n ")
            } else if (line == "rennen") {
                println("$username x")
                player.takeDamage(fists)
                print(" \n ")
            } else if (line == "vuist") {
                println("$username slaat ${joeBastianich.name} vol op zijn smoel! \n" + "Je slaat hem helemaal uit elkaar omdat je te hard sloeg!")
                joeBastianich.takeDamage(fists)
                print(" \n ")
            } else {
                println("Error, onjuiste input...")
                print(" \n ")
            }
        }
        println(
            "Er is niet veel meer over van Joe en je beseft je dat je op 'One Punch Man' lijkt! \n" +
                    "Daarom besluit je Joe zijn moeders scheermes af te pakken die hij bij zich had en scheer je jezelf kaal!"
        )
        player.inventory.add(scheerMes)
        player.showInventory()
        print(" \n ")

        //========================================================//
        //======================LEVEL 8===========================//
        //========================================================//
        print(" \n ")
        val gordonRamsay = Enemy("Gordon Ramsay", 120, 1, 8, false)
        val women = Loot ("Gordon's vrouw" , LootType.RANDOMSTUFF, 100000000)
        print("Je laatste tegenstander is the one and only ${gordonRamsay.name} hij staat supper kokky en dit wordt een lastige match lijkt  het!")
        print(" \n ")

        while (gordonRamsay.lives >= 1 && player.lives >= 1) {
            line = readLine()!!.toLowerCase()
            if (line == "vuist") {
                println("$username heeft geprobeerd om ${gordonRamsay.name} te slaan maar dat is niet gelukt! \n" +
                            "${gordonRamsay.name} countered met zijn eigen vuist en ook hij lijkt op One Punch Man met zijn vuist!")
                player.takeDamage(fists)
                print(" \n ")
            } else if (line == "onepunchman") {
                println("En wederom heb je ook met 1 stoot verslagen! Je bent een ware One Punch Man")
                gordonRamsay.takeDamage(fists)
                print(" \n ")
            } else if (line == "mini-pan") {
                println("Dit item is niet langer in je inventory, waardoor ${gordonRamsay.name} de tijd heeft om je te slaan")
                gordonRamsay.takeDamage(fists)
                print(" \n ")
            } else if (line == "rennen") {
                println("Je bent niet snel genoeg, waardoor ${gordonRamsay.name} de tijd heeft om je te slaan")
                gordonRamsay.takeDamage(fists)
                print(" \n ")
            } else {
                println("Error, onjuiste input...")
                print(" \n ")
            }
            player.inventory.add(women)
            player.showInventory()
            print(" \n ")
        }
        println(
            "Nu iedereen verslagen is kan je weer rustig naar huis keren! Niet alleen heb je je kookkunsten kunnen laten zien \n"
                    + "maar ook heb jij je vechtkracht laten zien!"
        )
        player.showInventory()
        print(" \n ")
        return true
    }
}