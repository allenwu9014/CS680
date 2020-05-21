package edu.umb.cs680.hw11;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparatorTest {
    Car[] Arraycar = { new Car("Mercedes", "CLA250", 51000, 2016, 19998.0f),
            new Car("Mercedes", "E300", 21000, 2018, 12000.0f),
            new Car("Mercedes", "C200", 68000, 2015, 15998.0f)};
    ArrayList<Car> cars = new ArrayList<Car>(Arrays.asList(Arraycar));
    @Test
    public void MileageCompareTest() {
        String[] expected = {"21000", "51000", "68000"};
        Collections.sort(cars, new MileageComparator());
        String[] actual = {String.valueOf(cars.get(0).getMileage()),
                String.valueOf(cars.get(1).getMileage()),
                String.valueOf(cars.get(2).getMileage())};
        assertArrayEquals(expected, actual );

    }
     @Test
    public void PriceCompareTest() {
        String[] expected = {"12000.0", "15998.0", "19998.0"};
        Collections.sort(cars, new PriceComparator());
        String[] actual = {String.valueOf(cars.get(0).getPrice()),
                String.valueOf(cars.get(1).getPrice()),
                String.valueOf(cars.get(2).getPrice())};
        assertArrayEquals(expected, actual );
    }
    @Test
    public void YearCompareTest() {
        String[] expected = {"2018", "2016", "2015"};
        Collections.sort(cars, new YearComparator());
        String[] actual = {String.valueOf(cars.get(0).getYear()),
                String.valueOf(cars.get(1).getYear()),
                String.valueOf(cars.get(2).getYear())};
        assertArrayEquals(expected, actual );
    }
    @Test
    public void ParetoCompareTest() {
        ArrayList<Car> cars2 = new ArrayList<Car>(Arrays.asList(Arraycar));
        for(int i = 0; i< cars.size(); i++) {
            cars.get(i).setDominationCount(cars2);
        }
        String[] expected = {"E300", "CLA250", "C200"};
        Collections.sort(cars, new ParetoComparator());
        String[] actual = {String.valueOf(cars.get(0).getModel()),
                String.valueOf(cars.get(1).getModel()),
                String.valueOf(cars.get(2).getModel())};
        assertArrayEquals(expected, actual );
    }

}