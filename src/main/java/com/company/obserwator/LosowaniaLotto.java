package com.company.obserwator;

import java.util.Observable;

/**
 * Created by Konrad on 29.06.2016.
 */
public class LosowaniaLotto extends Observable{

    private String lotto;
    private String multiLotto;
    private String extraLotto;

    public LosowaniaLotto() {

    }

    public void zmianaWartosci(){
        setChanged();
        notifyObservers();
    }

    public void ustawNowe(String lotto,String multiLotto,String extraLotto){
        this.lotto = lotto;
        this.multiLotto = multiLotto;
        this.extraLotto = extraLotto;
    }


    public String getLotto() {
        return lotto;
    }

    public String getMultiLotto() {
        return multiLotto;
    }

    public String getExtraLotto() {
        return extraLotto;
    }
}
