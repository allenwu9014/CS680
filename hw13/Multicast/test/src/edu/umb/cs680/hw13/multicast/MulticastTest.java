package edu.umb.cs680.hw13.multicast;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MulticastTest {
    StockQuoteObservable stock = new StockQuoteObservable();
    DJIAQuoteObservable djia = new DJIAQuoteObservable();

    PiechartObserver piechart = new PiechartObserver();
    TableObserver table = new TableObserver();
    ThreeDObserver threed = new ThreeDObserver();
    ByteArrayOutputStream stream;
    PrintStream printout;
@Test
    public void StockQuotePiechartObserverTest() {



    stream = new ByteArrayOutputStream();
    printout = new PrintStream(stream);
    System.setOut(printout);

    stock.addObserver(piechart);

    stock.notifyObservers(new StockEvent("A", 100.0f));

    String expected1 = " Piechart, Ticker = A, Quote = 100.0";
    assertEquals(expected1, stream.toString());


}
    @Test
    public void StockQuoteTableObserverTest() {



        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);
        stock.addObserver(table);


        stock.notifyObservers(new StockEvent("B", 200.0f));

        String expected1 =" Table, Ticker = B, Quote = 200.0";
        assertEquals(expected1, stream.toString());


    }
    @Test
    public void StockQuoteThreeDObserverTest() {



        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);


        stock.addObserver(threed);

        stock.notifyObservers(new StockEvent("C", 300.0f));
        String expected1 = " 3D, Ticker = C, Quote = 300.0";
        assertEquals(expected1, stream.toString());


    }



    @Test
    public void DJIAQuotePiechartObserverTest() {



        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);

        djia.addObserver(piechart);

        djia.notifyObservers(new DJIAEvent(100.0f));

        String expected1 = " Piechart, DJIA = 100.0";
        assertEquals(expected1, stream.toString());


    }
    @Test
    public void DJIAQuoteTableObserverTest() {



        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);
        djia.addObserver(table);

        djia.notifyObservers(new DJIAEvent( 200.0f));

        String expected1 =" Table, DJIA = 200.0";
        assertEquals(expected1, stream.toString());


    }
    @Test
    public void DJIAQuoteThreeDObserverTest() {



        stream = new ByteArrayOutputStream();
        printout = new PrintStream(stream);
        System.setOut(printout);


        djia.addObserver(threed);

        djia.notifyObservers(new DJIAEvent(300.0f));
        String expected1 = " 3D, DJIA = 300.0";
        assertEquals(expected1, stream.toString());


    }

}
