package edu.umb.cs680.hw13.multicast;




public class ThreeDObserver implements DJIAQuoteObserver, StockQuoteObserver {


    public void updateStock(StockEvent s) {

        System.out.print(" 3D, Ticker = " + s.getTicker()
                + ", Quote = " + s.getQuote());
    }


    public void updateDJIA(DJIAEvent d) {
        System.out.print(" 3D, DJIA = " + d.getDjia());
    }
}
