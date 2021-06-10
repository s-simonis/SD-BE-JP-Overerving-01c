package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.FalconRocket;
import nl.novi.javaprogrammeren.overerving.Rocket;

import javax.xml.stream.FactoryConfigurationError;

public class Main {
    /*
    Bekijk onderstaande code. Er zijn twee klasse, twee objecten.
    FalconRocket extends Rocket.

    Deze opdracht bestaat uit twee elementen. Het eerste element is om te oefenen. Het tweede element is een uitdagende
    opdracht.

    Element 1:
    De FalconRocket heeft reserve brandstof (extraFuel). Wanneer de raket niet genoeg fuel lijkt te hebben, moet er
    gekeken worden of er genoeg fuel is in extraFuel om het tekort op te vangen. Als dat zo is, moet er alsnog `true`
    geretourneerd worden.

    Element 2 (Uitdaging):
    Nadat er extra fuel gebruikt is, moet deze natuurlijk ook verminderd worden. Voeg dit toe aan de code.

     */

    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(100);
        FalconRocket falconRocket = new FalconRocket(300);

//        genericRocket.fly(10);
//        System.out.println(genericRocket.toString());
//        System.out.println(genericRocket.hasEnoughFuel(200));

        int neededFuel = 30;

        if (falconRocket.hasEnoughFuel(neededFuel)) {
            falconRocket.fly(neededFuel);
            System.out.println(falconRocket.toString());
        }
        else {
            System.out.println("The Falcon rocket needs servicing before it can leave.");
        }

        System.out.println("Currentfuel: "+falconRocket.currentFuel);
        System.out.println("Extrafuel: "+falconRocket.extraFuel);
    }
}
