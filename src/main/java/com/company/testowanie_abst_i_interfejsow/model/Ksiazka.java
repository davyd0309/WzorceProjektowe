package com.company.testowanie_abst_i_interfejsow.model;

import com.company.testowanie_abst_i_interfejsow.podatek.ObliczWartoscPodatkuInterface;

/**
 * Created by Konrad on 29.07.2017.
 */
public class Ksiazka extends Produkt{


    public Ksiazka(String nazwa, Integer cena, ObliczWartoscPodatkuInterface obliczWartoscPodatku) {
        super(nazwa, cena, obliczWartoscPodatku);
    }


}
