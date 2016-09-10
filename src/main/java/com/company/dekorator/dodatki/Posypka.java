package com.company.dekorator.dodatki;

import com.company.dekorator.abstrakcyjne.Napoj;
import com.company.dekorator.abstrakcyjne.SkladnikDekorator;

/**
 * Created by Konrad on 10.09.2016.
 */
public class Posypka extends SkladnikDekorator{

    private Napoj napoj;

    public Posypka(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " " + "POSYPKA";
    }

    @Override
    public double koszt() {
        return napoj.koszt()+1.88;
    }
}
