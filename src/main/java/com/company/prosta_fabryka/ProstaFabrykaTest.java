package com.company.prosta_fabryka;

/**
 * Created by Konrad on 29.07.2017.
 */
public class ProstaFabrykaTest {

    //Budujemy modele klasy,ktore bedziemy tworzyc przy pomocy klasy SimpleFactory
    //w zale¿noœci od podanego parametru metoda stworzTelefon zwraca konkretny obiekt klasy


    public static void main(String[] args) {
        Telefon telefon = SimpleFactory.stworzTelefon("Samsung");
        System.out.println(telefon.toString());

        telefon = SimpleFactory.stworzTelefon("Sony");
        System.out.println(telefon.toString());
    }
}
