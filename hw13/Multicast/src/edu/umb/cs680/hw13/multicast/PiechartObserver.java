package edu.umb.cs680.hw13.multicast;




public class PiechartObserver implements StockQuoteObserver, DJIAQuoteObserver {
    public void updateStock(StockEvent s) {


        System.out.print(" Piechart, Ticker = " + s.getTicker()
                + ", Quote = "  + s.getQuote());
    }

    public void updateDJIA(DJIAEvent d) {

        System.out.print(" Piechart, DJIA = " + d.getDjia());
    }
}