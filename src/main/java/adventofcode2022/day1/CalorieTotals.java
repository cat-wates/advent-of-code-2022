package adventofcode2022.day1;

import java.util.ArrayList;

public class CalorieTotals {

    int total;

    public ArrayList<Integer> caloriesPerElf(ArrayList<Integer> calories) {
        ArrayList<Integer> caloriesPerElf = new ArrayList<>();
//        calories.add(0); //adds 0 onto end of calories ArrayList to
        for (int i = 0; i < calories.size(); i++) {
            if (calories.get(i) == 0) {
                caloriesPerElf.add(total);
                total = 0;
            } else if (i == calories.size() - 1) {
                total += calories.get(i);
                caloriesPerElf.add(total);
            } else {
                total += calories.get(i);
            }
        }
//issue - last value doesn't add to list
        return caloriesPerElf;
    }
}
