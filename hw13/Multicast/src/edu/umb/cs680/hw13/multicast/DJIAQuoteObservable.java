package edu.umb.cs680.hw13.multicast;



import java.util.LinkedList;


public class DJIAQuoteObservable {
    private LinkedList<DJIAQuoteObserver> observers = new LinkedList<DJIAQuoteObserver>();

    public void addObserver(DJIAQuoteObserver ob) {
        observers.add(ob);
    }

    public void notifyObservers(DJIAEvent event) {
        for (DJIAQuoteObserver observer: observers) {
            observer.updateDJIA(event);
        }
    }
}