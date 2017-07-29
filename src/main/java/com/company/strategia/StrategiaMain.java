package com.company.strategia;

import com.company.strategia.model.*;

/**
 * Created by Konrad on 29.07.2017.
 */
public class StrategiaMain {

    //         Wystêpuje klasa abstrakcyjana oraz klasy ktore po niej dziedzicz¹.
//        Klasa abstrakcyjna posiada pola jako interfejsy
//        Klasy, które dziedzicz¹ w konstruktorze lub przez wstrzykiwanie maj¹ ustawione implementacje tych pól
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
