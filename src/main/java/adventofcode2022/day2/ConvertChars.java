package adventofcode2022.day2;


import java.util.*;

public class ConvertChars {

    Map<String, String> characterConversion = new HashMap<>();

//    Alternative approach:
//    Map<String, Integer> testMap = Map.of(
//            "A", 1,
//            "B", 2
//    );

    public ConvertChars() {
        characterConversion.put("A", "1");
        characterConversion.put("B", "2");
        characterConversion.put("C", "3");
        characterConversion.put("X", "1");
        characterConversion.put("Y", "2");
        characterConversion.put("Z", "3");
    }

    public ArrayList<String> convertCharsToInts(ArrayList<String> strategyPerRound) {
        ArrayList<String> convertedStrategyPerRound = new ArrayList<>();
        Set<String> keys = characterConversion.keySet();
        for (String strategy : strategyPerRound) {
            String conversion;
            for (String key : keys) {
                if (Objects.equals(strategy, key)) {
                    conversion = strategy.replace(key, characterConversion.get(key));
                    convertedStrategyPerRound.add(conversion);
                }
            }
        }
        return convertedStrategyPerRound;
    }
}
