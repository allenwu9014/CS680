package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {


    private String[] carToStringArray(Car c) {
        String[] carInfo = {c.getMake(),
                            c.getModel(),
                String.valueOf(c.getYear())
        };
        return carInfo;
    }
    @Test
    public void verifyCarEqualityWithMakeModelYear() {
        String[] expected = {"Mercedes", "CLA250", "2016"};
        Car actual = new Car("Mercedes", "CLA250", 51000, 2016, (float) 19998.0);
        assertArrayEquals(expected,
                carToStringArray(actual));
    }
   }
