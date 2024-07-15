package adventofcode2022.day4;

import adventofcode2022.day2.ReadFile;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            String filePath = "day4/ElfPairings.txt";
            ArrayList<String> elfPairings = ReadFile.readFile(filePath);
            int totalOverlappingPairs = 0;
            for (String singlePair : elfPairings) {
                ElfPair pairInstance = new ElfPair(singlePair);
                String[] elfOneBounds = pairInstance.splitIntoBounds(pairInstance.elfOne);
                String[] elfTwoBounds = pairInstance.splitIntoBounds(pairInstance.elfTwo);
                if (pairInstance.duplicateChecker(elfOneBounds, elfTwoBounds)) {
                    totalOverlappingPairs += 1;
                }
            }
            System.out.println(totalOverlappingPairs);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }

    }
}
