package pl.dawydiuk.pattern.observer;

public class Test {


    public static void main(String[] args) {

        PriceGrabber priceGrabber = new PriceGrabber();

        Observer observer1 = new PriceObserver(priceGrabber);
        priceGrabber.setAppPrice(25.55);
        priceGrabber.setGoogPrice(45.99);
        priceGrabber.setIbmPrice(78.99);


        Observer observer2 = new PriceObserver(priceGrabber);
        priceGrabber.setAppPrice(65.33);
        priceGrabber.setGoogPrice(11.79);
        priceGrabber.setIbmPrice(42.88);



    }

}
