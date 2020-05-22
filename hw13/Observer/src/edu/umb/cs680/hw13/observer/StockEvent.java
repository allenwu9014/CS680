package edu.umb.cs680.hw13.observer;

public class StockEvent {
    private String ticker;
    private float quote;
    StockEvent(String t, float q) {
        ticker = t;
        quote = q;
    }
    public String getTicker() {
        return ticker;
    }
    public float getQuote() {
        return quote;
    }
}
