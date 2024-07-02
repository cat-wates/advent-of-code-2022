package adventofcode2022.day1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalorieTotalsTest {

    @Test
    public void shouldTakeAnArrayOfCalsAndReturnAnArrayWithCalTotals() {
//        Given
        String filePath = "day1/ThreeCalorieVals.txt";
//        When
        ArrayList<Integer> listOfCals = ReadFile.readFile(filePath);
        CalorieTotals calTot = new CalorieTotals();
        ArrayList<Integer> caloriesPerElf = calTot.caloriesPerElf(listOfCals);
//        Then
        assertEquals(caloriesPerElf.size(), 2);
        assertEquals(caloriesPerElf.get(0), 2500);

    }
}
