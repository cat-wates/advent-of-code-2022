package adventofcode2022.one;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filePath = "one/CalorieList.txt"; //define file as variable
        ArrayList<Integer> calories = ReadFile.readFile(filePath);
        CalorieTotals calTot = new CalorieTotals();
        ArrayList<Integer> calsPerElf = calTot.caloriesPerElf(calories);
        MaxCalories maxC = new MaxCalories();
        int maxCalories1 = maxC.max3Calories(calsPerElf);
        System.out.println(maxCalories1);
    }
}