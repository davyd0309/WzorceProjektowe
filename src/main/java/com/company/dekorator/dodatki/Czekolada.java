package com.company.dekorator.dodatki;

import com.company.dekorator.abstrakcyjne.Napoj;
import com.company.dekorator.abstrakcyjne.SkladnikDekorator;

/**
 * Created by Konrad on 10.09.2016.
 */
public class Czekolada extends SkladnikDekorator{

    private Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " " + "CZEKOLADA";
    }

    @Override
    public double koszt() {
        return napoj.koszt()+0.55;
    }
}
