package adventofcode2022;

import java.util.ArrayList;

public class CalorieTotals {

    int total;

    public ArrayList<Integer> caloriesPerElf(ArrayList<Integer> calories) {
        ArrayList<Integer> caloriesPerElf = new ArrayList<>();
        calories.add(0); //adds 0 onto end of calories ArrayList to
        for (Integer calorie : calories) {
            if (calorie == 0) {
                caloriesPerElf.add(total);
                total = 0;
            } else {
                total += calorie;
            }

        }
//issue - last value doesn't add to list
return caloriesPerElf;
    }
}
