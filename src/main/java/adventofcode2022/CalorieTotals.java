package adventofcode2022;

import java.util.ArrayList;

public class CalorieTotals {

    int total;

    public ArrayList<Integer> caloriesPerElf(ArrayList<Integer> calories) {
        ArrayList<Integer> caloriesPerElf = new ArrayList<>();
        for (Integer calorie : calories) {
            if (calorie == 0) {
                caloriesPerElf.add(total);
                total = 0;
            } else {
                total += calorie;
            }

        }

return caloriesPerElf;
    }
}
