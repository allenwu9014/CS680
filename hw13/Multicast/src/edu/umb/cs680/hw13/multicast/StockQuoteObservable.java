package edu.umb.cs680.hw13.multicast;


import java.util.ArrayList;

public class StockQuoteObservable  {
    private ArrayList<StockQuoteObserver> observers = new ArrayList<StockQuoteObserver>();


    public void addObserver(StockQuoteObserver ob) {
        observers.add(ob);
    }

    public void notifyObservers(StockEvent event) {
        for (StockQuoteObserver observer: observers) {
            observer.updateStock(event);
        }
    }

}
