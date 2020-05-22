package edu.umb.cs680.hw13.observer;

import java.util.Observable;
import java.util.Observer;

public class PiechartObserver implements Observer {
    public void update(Observable o, Object arg) {
        if (arg instanceof StockEvent) {
                System.out.print(" Piechart, Ticker = " +
                    ((StockEvent) arg).getTicker() + ", Quote = " + ((StockEvent) arg).getQuote());
        } else if (arg instanceof DJIAEvent) {

            System.out.print(" Piechart, DJIA = " + ((DJIAEvent) arg).getDjia());
        }
    }
}