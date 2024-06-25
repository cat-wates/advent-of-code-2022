package adventofcode2022.two;

import java.util.ArrayList;

public class RoundScoring {

    int total = 0;

    public int calculateRoundTotals(ArrayList<String> convertedStrategyPerRound) {
        for (String round : convertedStrategyPerRound) {
            int opponentMove = Character.getNumericValue(round.charAt(0));
            int myMove = Character.getNumericValue(round.charAt(2));
            //draws
            if (opponentMove == myMove) {
                total = total + 3 + myMove;
            }
            //wins
            else if ((opponentMove == 1 && myMove == 2) || (opponentMove == 2 && myMove == 3) || (opponentMove == 3 && myMove == 1)) {
                total = total + 6 + myMove;
            }
            //loses
            else if ((opponentMove == 1 && myMove == 3) || (opponentMove == 2 && myMove == 1) || (opponentMove == 3 && myMove == 2)) {
                total += myMove;
            }
        }
        return total;

    }


}
