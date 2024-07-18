package adventofcode2022.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//    part A
//    public static void main(String[] args) {
//        try {
//            String filePath = "day4/ElfPairings.txt";
//            ArrayList<String> elfPairings = adventofcode2022.day2.ReadFile.readFile(filePath);
//            int totalOverlappingPairs = 0;
//            for (String singlePair : elfPairings) {
//                ElfPair pairInstance = new ElfPair(singlePair);
//                String[] elfOneBounds = pairInstance.splitIntoBounds(pairInstance.elfOne);
//                String[] elfTwoBounds = pairInstance.splitIntoBounds(pairInstance.elfTwo);
//                if (pairInstance.completeDuplicateChecker(elfOneBounds, elfTwoBounds)) {
//                    totalOverlappingPairs += 1;
//                }
//            }
//            System.out.println(totalOverlappingPairs);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//            System.err.println(Arrays.toString(e.getStackTrace()));
//        }
//    }

//    part B
    public static void main(String[] args) {
        try {
            String filePath = "day4/ElfPairings.txt";
            ArrayList<String> elfPairings = adventofcode2022.day2.ReadFile.readFile(filePath);
            int totalOverlappingPairs = 0;
            for (String singlePair : elfPairings) {
                ElfPair pairInstance = new ElfPair(singlePair);
                String[] elfOneBounds = pairInstance.splitIntoBounds(pairInstance.elfOne);
                String[] elfTwoBounds = pairInstance.splitIntoBounds(pairInstance.elfTwo);
                if (pairInstance.anyDuplicateChecker(elfOneBounds, elfTwoBounds)) {
                    totalOverlappingPairs += 1;
                }
            }
            System.out.println(totalOverlappingPairs);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
