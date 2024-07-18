package adventofcode2022.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            String filePath = "day2/StrategyGuide.txt";
            ArrayList<String> strategyPerRound = ReadFile.readFile(filePath);
            ConvertChars cc = new ConvertChars();
            ArrayList<String> convertedStrategyPerRound = cc.convertCharsToInts(strategyPerRound);
            RoundScoring rs = new RoundScoring();
            int total = rs.calculateRoundTotals(convertedStrategyPerRound);
            System.out.println("Part A total: " + total);
            int enhancedTotal = rs.calculateEnhancedRoundTotals(convertedStrategyPerRound);
            System.out.println("Part B total: " + enhancedTotal);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
