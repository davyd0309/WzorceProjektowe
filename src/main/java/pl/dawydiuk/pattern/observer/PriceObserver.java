package pl.dawydiuk.pattern.observer;

public class PriceObserver implements Observer {


    private double ibmPrice;
    private double appPrice;
    private double googPrice;


    private static int observerIdTracker = 0;

    private int observerId;

    private Grabber priceGrabber;


    public PriceObserver(Grabber priceGrabber) {
        this.priceGrabber = priceGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New observer " + this.observerId);
        priceGrabber.register(this);
    }

    public void update(double ibmPrice, double appPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.appPrice = appPrice;
        this.googPrice = googPrice;
        printThePrices();
    }


    private void printThePrices() {
        System.out.println("observerId  " + observerId + "--" +
                " ibmPrice=" + ibmPrice +
                ", appPrice=" + appPrice +
                ", googPrice=" + googPrice );
    }


}
