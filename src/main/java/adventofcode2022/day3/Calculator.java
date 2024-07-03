package adventofcode2022.day3;

import java.util.ArrayList;

public class Calculator {

    ArrayList<String> priorityList;

    public Calculator(ArrayList<String> priorityList) {
        this.priorityList = priorityList;
    }

    public int calculateTotal(ArrayList<String> priorityList) {
        int total = 0;
        for (String item : priorityList) {
            int newItem = Integer.parseInt(item);
            total += newItem;
        }
        return total;
    }
}