package edu.umb.cs680.hw13.observer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.*;

public class ObservableTest {
    StockQuoteObservable stock = new StockQuoteObservable();
    DJIAQuoteObservable djia = new DJIAQuoteObservable();

    PiechartObserver piechart = new PiechartObserver();
    TableObserver table = new TableObserver();
    ThreeDObserver threed = new ThreeDObserver();
    ByteArrayOutputStream stream;
    PrintStream printout;
@Test
public void StockPiecharObserverTest() {





        stream = new ByteArrayOutputStream();
         printout = new PrintStream(stream);
        System.setOut(printout);
    stock.addObserver(piechart);
        stock.changeQuote("A", 100f);
        String expected = " Piechart, Ticker = A, Quote = 100.0";
        assertEquals(expected, stream.toString());


}
    @Test
    public void StockTableObserverTest() {




        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);

        stock.addObserver(table);
        stock.changeQuote("B", 200f);
        String expected = " Table, Ticker = B, Quote = 200.0";
        assertEquals(expected, stream.toString());


    }
    @Test
    public void StockThreeDObserverTest() {




        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);

        stock.addObserver(threed);
        stock.changeQuote("C", 300f);
        String expected = " 3D, Ticker = C, Quote = 300.0";
        assertEquals(expected, stream.toString());


    }

    @Test
    public void DJIAQuotePiechartObserverTest() {



        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);

        djia.addObserver(piechart);

        djia.changeQuote(100.0f);

        String expected1 = " Piechart, DJIA = 100.0";
        assertEquals(expected1, stream.toString());


    }
    @Test
    public void DJIAQuoteTableObserverTest() {



        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);
        djia.addObserver(table);

        djia.changeQuote( 200.0f);

        String expected1 =" Table, DJIA = 200.0";
        assertEquals(expected1, stream.toString());


    }
    @Test
    public void DJIAQuoteThreeDObserverTest() {



        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);


        djia.addObserver(threed);

        djia.changeQuote(300.0f);
        String expected1 = " 3D, DJIA = 300.0";
        assertEquals(expected1, stream.toString());


    }
}

