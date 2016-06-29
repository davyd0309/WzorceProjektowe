package com.company.obserwator;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Konrad on 29.06.2016.
 */
@Log
public class Wyswietl1 implements Observer {

    Observable observable;
    private String lotto;
    private String multiLotto;
    private String extraLotto;


    public Wyswietl1(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    public void update(Observable obs, Object arg) {
        if (obs instanceof LosowaniaLotto) {
            LosowaniaLotto losowanie = (LosowaniaLotto) obs;
            this.lotto = losowanie.getLotto();
            this.multiLotto = losowanie.getMultiLotto();
            this.extraLotto = losowanie.getExtraLotto();
            System.out.println("Wyswietl1{" +
                    ", lotto='" + lotto + '\'' +
                    ", multiLotto='" + multiLotto + '\'' +
                    ", extraLotto='" + extraLotto + '\'' +
                    '}');
        }
    }


}
