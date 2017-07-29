package com.company.prosta_fabryka;

/**
 * Created by Konrad on 29.07.2017.
 */
public class SimpleFactory {

    public static Telefon stworzTelefon(String typ) {
        Telefon telefon;
        if (typ.equals("Samsung")) {
            telefon = new TelefonSamsung();
        } else if (typ.equals("Sony")) {
            telefon = new TelefonSony();
        } else {
            telefon = null;
        }
        return telefon;
    }

}
