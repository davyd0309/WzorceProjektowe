package com.company.strategia;

import com.company.strategia.model.*;

/**
 * Created by Konrad on 29.07.2017.
 */
public class StrategiaMain {

    //    Wyst�puje klasa abstrakcyjana oraz klasy ktore po niej dziedzicz�.
//        Klasa abstrakcyjna posiada pola jako interfejsy
//        Klasy, kt�re dziedzicz� w konstruktorze lub przez wstrzykiwanie maj� ustawione implementacje tych p�l
//        Kazda dodatkowa funkcjonalnosc rozna dla klas powinna byc interfejsem, ktory ma rozne implementacje.
//

    public static void main(String[] args) {

        Robot terminator = new Terminator();
        terminator.lec();
        terminator.strzelam();

        Robot optimus = new Optimus();
        optimus.lec();
        optimus.strzelam();

    }
}
