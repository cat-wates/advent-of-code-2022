package adventofcode2022.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//part A
//    public static void main(String[] args) {
//        try {
//            String filePath = "day3/Rucksacks.txt";
//            ArrayList<String> rucksacks = ReadFile.readFile(filePath);
//            ArrayList<Character> commonItems = new ArrayList<>();
//            for (String rucksack : rucksacks) {
//                Rucksack rucksackInstance = new Rucksack(rucksack);
//                rucksackInstance.splitRucksackIntoCompartments(rucksack);
//                CommonItemFinder cif = new CommonItemFinder(rucksackInstance);
//                commonItems.add(cif.compareCompartments(rucksackInstance.compartmentOne, rucksackInstance.compartmentTwo));
//            }
//            PriorityFinder pf = new PriorityFinder(commonItems);
//            ArrayList<Integer> priorityList = pf.replaceCharWithInt(commonItems);
//            Calculator calc = new Calculator(priorityList);
//            System.out.println(calc.calculateTotal(priorityList));
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//            System.err.println(Arrays.toString(e.getStackTrace()));
//        }
//    }

// part B

public static void main(String[] args) {
    try {
        String filePath = "day3/Rucksacks.txt";
        ArrayList<String> rucksacks = ReadFile.readFile(filePath);
        BadgeFinder bf = new BadgeFinder(rucksacks);
        ArrayList<Character> badges = bf.findBadge(rucksacks);
        PriorityFinder pf = new PriorityFinder(badges);
        ArrayList<Integer> priorityList = pf.replaceCharWithInt(badges);
        Calculator calc = new Calculator(priorityList);
        System.out.println(calc.calculateTotal(priorityList));
    } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
}
}
