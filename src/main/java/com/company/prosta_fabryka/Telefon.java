package com.company.prosta_fabryka;

/**
 * Created by Konrad on 29.07.2017.
 */
public class Telefon {

    protected String nazwa;
    protected Integer cena;

    @Override
    public String toString() {
        return "Telefon{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
