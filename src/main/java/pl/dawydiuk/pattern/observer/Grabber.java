package pl.dawydiuk.pattern.observer;



public interface Grabber {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObserver();
}
