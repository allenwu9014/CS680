package edu.umb.cs680.hw13.multicast;



public class TableObserver implements DJIAQuoteObserver, StockQuoteObserver {

    public void updateStock(StockEvent s) {


            System.out.print(" Table, Ticker = " + s.getTicker()
                    + ", Quote = "  + s.getQuote());
        }

        public void updateDJIA(DJIAEvent d) {

             System.out.print(" Table, DJIA = " + d.getDjia());
        }
    }


