package com.company.dekorator;

import com.company.dekorator.abstrakcyjne.Napoj;
import com.company.dekorator.dodatki.Czekolada;
import com.company.dekorator.dodatki.Posypka;
import com.company.dekorator.kawa.Espresso;
import com.company.dekorator.kawa.Mocna;

/**
 * Created by Konrad on 29.07.2017.
 */
public class DekoratorMain {


//          Wzorca dekorator u¿ywamy gdy chcemy dodaæ kolejne w³asciwosci do obiektu.
//          W moim przypadku kiedy mamy klase g³owna Napoj i dodajemy do niej roznego rodzaju dodatki
//          Moze to byc rownie dobrze kazdy obiekt ktory chcemy udekorowac.


    public static void main(String[] args) {


        Napoj espresso = new Espresso();
        Napoj mocna = new Mocna();

        System.out.println(espresso.pobierzOpis() + " " + espresso.koszt());
        System.out.println(mocna.pobierzOpis() + " " + mocna.koszt());

        espresso = new Czekolada(espresso);
        espresso = new Czekolada(espresso);
        espresso = new Posypka(espresso);

        mocna = new Posypka(mocna);

        System.out.println(espresso.pobierzOpis() + " " + espresso.koszt());
        System.out.println(mocna.pobierzOpis() + " " + mocna.koszt());

    }
}
