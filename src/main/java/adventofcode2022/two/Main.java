package adventofcode2022.two;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
        String filePath = "two/StrategyGuide.txt";
        ArrayList<String> strategyPerRound = ReadFile.readFile(filePath);
        System.out.println(strategyPerRound);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }



    }
}
