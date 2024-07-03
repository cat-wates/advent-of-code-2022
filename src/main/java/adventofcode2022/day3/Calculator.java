package adventofcode2022.day3;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> priorityList;

    public Calculator(ArrayList<Integer> priorityList) {
        this.priorityList = priorityList;
    }

    public int calculateTotal(ArrayList<Integer> priorityList) {
        int total = 0;
        for (int item : priorityList) {
            total += item;
        }
        return total;
    }
}