package pl.dawydiuk.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class PriceGrabber implements Grabber {


    private List<Observer> observers;

    private double ibmPrice;
    private double appPrice;
    private double googPrice;


    public PriceGrabber() {

        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        observers.remove(observerIndex);
    }

    public void notifyObserver() {
        for (Observer observer :observers) {
            observer.update(ibmPrice,appPrice,googPrice);
        }
    }


    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAppPrice(double appPrice) {
        this.appPrice = appPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
