package adventofcode2022;

import java.util.ArrayList;

public class MaxCalories {

    int currentMax;

    public int maxCalories(ArrayList<Integer> calsPerElf) {
        currentMax = calsPerElf.get(0);
        for (int cals : calsPerElf) {
            if (cals > currentMax) {
                currentMax = cals;
            }
        }
        return currentMax;
    }


}
