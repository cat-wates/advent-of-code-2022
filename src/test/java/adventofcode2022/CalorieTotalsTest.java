package adventofcode2022;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalorieTotalsTest {

    @Test
    public void should() throws IOException {
//        Given
        String filePath = "ThreeCalorieVals.txt";
//        When
        ArrayList<Integer> listOfCals = ReadFile.readFile(filePath);
        CalorieTotals calTot = new CalorieTotals();
        ArrayList<Integer> caloriesPerElf = calTot.caloriesPerElf(listOfCals);
//        Then
        assertEquals(caloriesPerElf.size(), 2);
        assertEquals(caloriesPerElf.get(0), 9736);

    }
}
