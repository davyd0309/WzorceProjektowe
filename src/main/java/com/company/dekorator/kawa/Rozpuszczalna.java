package com.company.dekorator.kawa;

import com.company.dekorator.abstrakcyjne.Napoj;

/**
 * Created by Konrad on 10.09.2016.
 */
public class Rozpuszczalna extends Napoj{

    public Rozpuszczalna() {
        opis = "Kawa Rozpuszczalna";
    }

    @Override
    public double koszt() {
        return 2.99;
    }
}
