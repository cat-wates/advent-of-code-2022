package adventofcode2022;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxCaloriesTest {

    @Test
    public void shouldScanArrayAndFindLargestValue() {
//        Given
        String filePath = "ThreeCalorieVals.txt";
//        When
        ArrayList<Integer> listOfCals = ReadFile.readFile(filePath);
        CalorieTotals calTot = new CalorieTotals();
        ArrayList<Integer> caloriesPerElf = calTot.caloriesPerElf(listOfCals);
        MaxCalories maxC = new MaxCalories();
        int maxCalories = maxC.maxCalories(caloriesPerElf);

//        Then
        assertEquals(maxCalories, 2500);

    }
}
