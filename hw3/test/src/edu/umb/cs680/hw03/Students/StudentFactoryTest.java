package edu.umb.cs680.hw03.Students;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentFactoryTest {
    @Test
    public void createInStateTest() {
        String expectedname = "Joe";
        String expectedusAddr = "localStreet";
        float exppectedtution = (float) 1000.0;
        StudentFactory.Student studentInstate = StudentFactory.createInState("Joe", "localStreet");
        assertEquals(expectedname, studentInstate.getName());
        assertEquals(expectedusAddr, studentInstate.getUSAddress());
        assertEquals(exppectedtution, studentInstate.getTuition(), 0);
    }

    @Test
    public void createOutStateTest() {
        String expectedname = "Tom";
        String expectedusAddr = "OutStreet";
        int expectedyrsInState = 2222;
        float exppectedtution = (float)3000.0;
        StudentFactory.Student studentOutstate = StudentFactory.createOutState("Tom", "OutStreet", 2222);
        assertEquals(expectedname, studentOutstate.getName());
        assertEquals(expectedusAddr, studentOutstate.getUSAddress());
        assertEquals(expectedyrsInState, studentOutstate.getyrsInState(), 0);
        assertEquals(exppectedtution, studentOutstate.getTuition(), 0);
    }
    @Test
    public void createIntlStateTest() {
        String expectedname = "Sam";
        String expectedusAddr = "OutCountryStreet";
        int expectedi20num = 3333;
        String expectedforeignAddr = "Out";
        float exppectedtution = (float)5000.0;
        StudentFactory.Student studentIntlstate = StudentFactory.createIntlState("Sam", "OutCountryStreet",
                3333, "Out");
        assertEquals(expectedname, studentIntlstate.getName());
        assertEquals(expectedusAddr, studentIntlstate.getUSAddress());
        assertEquals(expectedi20num, studentIntlstate.getI20Number(), 0);
        assertEquals(expectedforeignAddr, studentIntlstate.getForeignAddr());
        assertEquals(exppectedtution, studentIntlstate.getTuition(), 0);
    }
}