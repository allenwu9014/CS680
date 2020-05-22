package edu.umb.cs680.hw13.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.lang.Float;

public class StockQuoteObservable extends Observable {
    private Map<String, Float> tickerquotemap= new HashMap<String, Float>();

    public void changeQuote(String t, float q) {
        tickerquotemap.put(t, q);
        setChanged();
        notifyObservers(new StockEvent(t,q));
    }

}
