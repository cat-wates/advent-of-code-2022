package adventofcode2022.day1;

import java.util.ArrayList;

public class MaxCalories {

    int currentMax;
    int max3Cals;

    public int maxCalories(ArrayList<Integer> calsPerElf) {
//        calsPerElf.sort(null);
        currentMax = calsPerElf.get(0);
        for (int cals : calsPerElf) {
            if (cals > currentMax) {
                currentMax = cals;
            }
        }
        return currentMax;
    }

    public int max3Calories(ArrayList<Integer> calsPerElf) {
        for (int i = 1; i < 4; i++) {
            int max = maxCalories(calsPerElf);
            max3Cals += max;
            calsPerElf.remove((Integer) max);
        }


        return max3Cals;
    }


}
