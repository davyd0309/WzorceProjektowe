package com.company.dekorator.abstrakcyjne;

/**
 * Created by Konrad on 10.09.2016.
 */
public abstract class Napoj {

        protected String opis;

        public String pobierzOpis(){
            return opis;
        }

        public abstract double koszt();
}
