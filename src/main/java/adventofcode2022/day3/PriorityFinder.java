package adventofcode2022.day3;

import java.util.ArrayList;

public class PriorityFinder {

    ArrayList<Character> commonItems;

    public PriorityFinder(ArrayList<Character> commonItems) {
        this.commonItems = commonItems;
    }

    public ArrayList<String> replaceCharWithInt(ArrayList<Character> commonItems) {
        ArrayList<String> priorityList = new ArrayList<>();
        for (char item : commonItems) {
            String newItem = Character.toString(item);
            String conversion = newItem.replace("a", "1")
                    .replace("b", "2")
                    .replace("c", "3")
                    .replace("d", "4")
                    .replace("e", "5")
                    .replace("f", "6")
                    .replace("g", "7")
                    .replace("h", "8")
                    .replace("i", "9")
                    .replace("j", "10")
                    .replace("k", "11")
                    .replace("l", "12")
                    .replace("m", "13")
                    .replace("n", "14")
                    .replace("o", "15")
                    .replace("p", "16")
                    .replace("q", "17")
                    .replace("r", "18")
                    .replace("s", "19")
                    .replace("t", "20")
                    .replace("u", "21")
                    .replace("v", "22")
                    .replace("w", "23")
                    .replace("x", "24")
                    .replace("y", "25")
                    .replace("z", "26")
                    .replace("A", "27")
                    .replace("B", "28")
                    .replace("C", "29")
                    .replace("D", "30")
                    .replace("E", "31")
                    .replace("F", "32")
                    .replace("G", "33")
                    .replace("H", "34")
                    .replace("I", "35")
                    .replace("J", "36")
                    .replace("K", "37")
                    .replace("L", "38")
                    .replace("M", "39")
                    .replace("N", "40")
                    .replace("O", "41")
                    .replace("P", "42")
                    .replace("Q", "43")
                    .replace("R", "44")
                    .replace("S", "45")
                    .replace("T", "46")
                    .replace("U", "47")
                    .replace("V", "48")
                    .replace("W", "49")
                    .replace("X", "50")
                    .replace("Y", "51")
                    .replace("Z", "52");
            priorityList.add(conversion);
        }
        return priorityList;
    }
}
