package com.company.testowanie_abst_i_interfejsow;

import com.company.testowanie_abst_i_interfejsow.model.Ksiazka;
import com.company.testowanie_abst_i_interfejsow.model.Kubek;
import com.company.testowanie_abst_i_interfejsow.model.Produkt;
import com.company.testowanie_abst_i_interfejsow.podatek.PodatekMniejszy;
import com.company.testowanie_abst_i_interfejsow.podatek.PodatekWiekszy;

/**
 * Created by Konrad on 29.07.2017.
 */
public class TestowanieMain {


    public static void main(String[] args) {

        Produkt ksiazka = new Ksiazka("W pustyni", 50, new PodatekMniejszy());
        Produkt kubek = new Kubek("Z³oty kubeczek", 250, new PodatekWiekszy());


        System.out.println(ksiazka.toString());
        System.out.println(kubek.toString());

    }


}
