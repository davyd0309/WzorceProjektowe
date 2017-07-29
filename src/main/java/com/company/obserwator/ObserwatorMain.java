package com.company.obserwator;

/**
 * Created by Konrad on 29.07.2017.
 */
public class ObserwatorMain {


//        Klasa g³ówna z ktorej bedziemy odczytywac dane musi dziedziczyc po Observable
//         Sa tam pola ktorych nowe wartosci sa ustawiane metoda ustawNowe()
//        Klasy ktore obserwuja implementuja interfejs Observer,takie same pola jak klasa z danymi oraz metode update, ktora ustawia pola na aktualne
//

    public static void main(String[] args) {

        LosowaniaLotto losowanie1 = new LosowaniaLotto();
        losowanie1.ustawNowe("lotto:1,2,5,6,8,7","multi:55,68,88,44,55,66,44,66,88,44","extra:65,62,33,12,78,69,1");

        Wyswietl1 wyswietl1 = new Wyswietl1(losowanie1);
        wyswietl1.update(losowanie1,null);

        losowanie1.ustawNowe("lotto:aaa","multi:bbbb","extra:ccc");
        wyswietl1.update(losowanie1,null);

    }
}
