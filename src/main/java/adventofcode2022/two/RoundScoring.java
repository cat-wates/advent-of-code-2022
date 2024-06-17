package adventofcode2022.two;

import java.util.ArrayList;

public class RoundScoring {

    int total = 0;

    public int calculateRoundTotals(ArrayList<String> convertedStrategyPerRound) {
        for (String round : convertedStrategyPerRound) {
            if (round.equals("1 1")) {
                total += 4;
            }
            else if (round.equals("1 2")) {
                total += 8;
            }
            else if (round.equals("1 3")) {
                total += 3;
            }
            else if (round.equals("2 1")) {
                total += 1;
            }
            else if (round.equals("2 2")) {
                total += 5;
            }
            else if (round.equals("2 3")) {
                total += 9;
            }
            else if (round.equals("3 1")) {
                total += 7;
            }
            else if (round.equals("3 2")) {
                total += 2;
            }
            else if (round.equals("3 3")) {
                total += 6;
            }
        }
        return total;

    }


}
