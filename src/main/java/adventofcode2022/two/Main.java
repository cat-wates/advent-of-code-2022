package adventofcode2022.two;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
        String filePath = "two/StrategyGuide.txt";
        ArrayList<String> strategyPerRound = ReadFile.readFile(filePath);
        ConvertChars cc = new ConvertChars();
        ArrayList<String> convertedStrategyPerRound = cc.convertCharsToInts(strategyPerRound);
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(convertedStrategyPerRound);
        System.out.println(total);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }



    }
}
