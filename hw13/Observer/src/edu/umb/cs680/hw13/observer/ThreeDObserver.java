package edu.umb.cs680.hw13.observer;

import java.util.Observable;
import java.util.Observer;

public class ThreeDObserver implements Observer {

    public void update(Observable o, Object arg) {
        if (arg instanceof StockEvent) {
             System.out.print(" 3D, Ticker = " + ((StockEvent)arg).getTicker()
                     + ", Quote = "  + ((StockEvent)arg).getQuote());
        }
        else if (arg instanceof DJIAEvent) {
              System.out.print(" 3D, DJIA = " + ((DJIAEvent)arg).getDjia());
        }

    }

}
