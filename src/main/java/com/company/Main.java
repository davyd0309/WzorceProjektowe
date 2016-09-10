package com.company;

import com.company.dekorator.abstrakcyjne.Napoj;
import com.company.dekorator.abstrakcyjne.SkladnikDekorator;
import com.company.dekorator.dodatki.Czekolada;
import com.company.dekorator.dodatki.Posypka;
import com.company.dekorator.kawa.Espresso;
import com.company.dekorator.kawa.Mocna;
import com.company.obserwator.LosowaniaLotto;
import com.company.obserwator.Wyswietl1;
import com.company.strategia.model.*;

public class Main {

    public static void main(String[] args) {


//        -------STRATEGIA -------------------------------------------------------------------------------------------
//         Wyst�puje klasa abstrakcyjana oraz klasy ktore po niej dziedzicz�.
//        Klasa abstrakcyjna posiada pola jako interfejsy
//        Klasy, kt�re dziedzicz� w konstruktorze lub przez wstrzykiwanie maj� ustawione implementacje tych p�l
//        Kazda dodatkowa funkcjonalnosc rozna dla klas powinna byc interfejsem, ktory ma rozne implementacje.
//
//                Robot terminator = new Terminator();
//                terminator.lec();
//                terminator.strzelam();
//
//                Robot optimus = new Optimus();
//                optimus.lec();
//                optimus.strzelam();
//
//


//        -------OBSERWATOR -------------------------------------------------------------------------------------------
//        Klasa g��wna z ktorej bedziemy odczytywac dane musi dziedziczyc po Observable
//         Sa tam pola ktorych nowe wartosci sa ustawiane metoda ustawNowe()
//        Klasy ktore obserwuja implementuja interfejs Observerm,takie same pola jak klasa z danymi oraz metode update, ktora ustawia pola na aktualne
//
//        LosowaniaLotto losowanie1 = new LosowaniaLotto();
//        losowanie1.ustawNowe("lotto:1,2,5,6,8,7","multi:55,68,88,44,55,66,44,66,88,44","extra:65,62,33,12,78,69,1");
//
//        Wyswietl1 wyswietl1 = new Wyswietl1(losowanie1);
//        wyswietl1.update(losowanie1,null);
//
//        losowanie1.ustawNowe("lotto:aaa","multi:bbbb","extra:ccc");
//        wyswietl1.update(losowanie1,null);



//        -------DEKORATOR -------------------------------------------------------------------------------------------
//          Wzorca dekorator u�ywamy gdy chcemy doda� kolejne w�asciwosci do obiektu.
//          W moim przypadku kiedy mamy klase g�owna Napoj i dodajemy do niej roznego rodzaju dodatki
//          Moze to byc rownie dobrze kazdy obiekt ktory chcemy udekorowac.
//
//
//
//        Napoj espresso = new Espresso();
//        Napoj mocna = new Mocna();
//
//        System.out.println(espresso.pobierzOpis() + " " + espresso.koszt());
//        System.out.println(mocna.pobierzOpis() + " " + mocna.koszt());
//
//        espresso = new Czekolada(espresso);
//        espresso = new Czekolada(espresso);
//        espresso = new Posypka(espresso);
//
//        mocna = new Posypka(mocna);
//
//        System.out.println(espresso.pobierzOpis() + " " + espresso.koszt());
//        System.out.println(mocna.pobierzOpis() + " " + mocna.koszt());
    }

}
