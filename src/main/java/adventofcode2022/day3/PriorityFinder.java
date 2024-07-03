package adventofcode2022.day3;

import java.util.ArrayList;

public class PriorityFinder {

    ArrayList<Character> commonItems;

    public PriorityFinder(ArrayList<Character> commonItems) {
        this.commonItems = commonItems;
    }

    public ArrayList<Integer> replaceCharWithInt(ArrayList<Character> commonItems) {
        ArrayList<Integer> priorityList = new ArrayList<>();
        int conversion = 0;
        for (char item : commonItems) {
            for (char alphabet = 'a'; alphabet <= 'z'; alphabet ++) {
                if (item == alphabet) {
                    conversion = (int) item - 96; //chars a to z are 97-122 in ASCII
                    break;
                }
            }
            for (char alphabet = 'A'; alphabet <= 'Z'; alphabet ++) {
                if (item == alphabet) {
                    conversion = (int) item - 38; //chars A to Z are 65-90 in ASCII
                    break;
                }
            }
            priorityList.add(conversion);
        }
        return priorityList;
    }
}
