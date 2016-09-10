package com.company.dekorator.kawa;

import com.company.dekorator.abstrakcyjne.Napoj;

/**
 * Created by Konrad on 10.09.2016.
 */
public class Espresso extends Napoj{

    public Espresso() {
        opis = "Kawa Espresso";
    }

    @Override
    public double koszt() {
        return 1.55;
    }
}
