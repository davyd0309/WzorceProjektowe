package com.company.dekorator.kawa;

import com.company.dekorator.abstrakcyjne.Napoj;

/**
 * Created by Konrad on 10.09.2016.
 */
public class Mocna extends Napoj{

    public Mocna() {
        opis = "Kawa Mocna";
    }

    @Override
    public double koszt() {
        return 5.25;
    }
}
