package com.company.testowanie_abst_i_interfejsow.model;

import com.company.testowanie_abst_i_interfejsow.podatek.ObliczWartoscPodatkuInterface;

/**
 * Created by Konrad on 29.07.2017.
 */
public abstract class Produkt {

    protected String nazwa;
    protected Integer cena;
    protected ObliczWartoscPodatkuInterface obliczWartoscPodatku;


    public Produkt(String nazwa, Integer cena, ObliczWartoscPodatkuInterface obliczWartoscPodatku) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.obliczWartoscPodatku = obliczWartoscPodatku;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public ObliczWartoscPodatkuInterface getObliczWartoscPodatku() {
        return obliczWartoscPodatku;
    }

    public void setObliczWartoscPodatku(ObliczWartoscPodatkuInterface obliczWartoscPodatku) {
        this.obliczWartoscPodatku = obliczWartoscPodatku;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", obliczWartoscPodatku=" + obliczWartoscPodatku.obliczWartoscPodatku() +
                '}';
    }
}
