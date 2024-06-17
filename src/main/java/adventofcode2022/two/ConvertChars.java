package adventofcode2022.two;


import java.util.ArrayList;

public class ConvertChars {

    public ArrayList<String> convertCharsToInts(ArrayList<String> strategyPerRound) {
        ArrayList<String> convertedStrategyPerRound = new ArrayList<>();
        for (String strategy : strategyPerRound) {
            String conversion = strategy.replace("A", "1")
                    .replace("B", "2")
                    .replace("C", "3")
                    .replace("X", "1")
                    .replace("Y", "2")
                    .replace("Z", "3");
            convertedStrategyPerRound.add(conversion);
        }

        return convertedStrategyPerRound;
    }
}
