package adventofcode2022.day2;

import java.util.ArrayList;

public class RoundScoring {

    final int ROCK = 1;
    final int PAPER = 2;
    final int SCISSORS = 3;
    final int LOSE = 1;
    final int DRAW = 2;
    final int WIN = 3;

    public int calculateRoundTotals(ArrayList<String> convertedStrategyPerRound) {
        int total = 0;
        for (String round : convertedStrategyPerRound) {
            int opponentMove = Character.getNumericValue(round.charAt(0));
            int myMove = Character.getNumericValue(round.charAt(2));
            //draws
            if (opponentMove == myMove) {
                total = total + 3 + myMove;
            }
            //wins
            else if ((opponentMove == ROCK && myMove == PAPER) || (opponentMove == PAPER && myMove == SCISSORS) || (opponentMove == SCISSORS && myMove == ROCK)) {
                total = total + 6 + myMove;
            }
            //loses
            else if ((opponentMove == ROCK && myMove == SCISSORS) || (opponentMove == PAPER && myMove == ROCK) || (opponentMove == SCISSORS && myMove == PAPER)) {
                total += myMove;
            }
        }
        return total;

    }

    public int calculateEnhancedRoundTotals(ArrayList<String> convertedStrategyPerRound) {
        int total = 0;
        for (String round : convertedStrategyPerRound) {
            int opponentMove = Character.getNumericValue(round.charAt(0));
            int desiredOutcome = Character.getNumericValue(round.charAt(2));
            int myMove = 0;
            //draws
            if (desiredOutcome == DRAW) {
                myMove = opponentMove;
                total = total + 3 + myMove;
            }
            else if (desiredOutcome == LOSE) {
                switch (opponentMove) {
                    case ROCK:
                        myMove = SCISSORS;
                        break;
                    case PAPER:
                        myMove = ROCK;
                        break;
                    case SCISSORS:
                        myMove = PAPER;
                        break;
                    default:
                        System.out.println("Error");
                }
                total += myMove;
            }
            else if (desiredOutcome == WIN) {
                switch (opponentMove) {
                    case ROCK:
                        myMove = PAPER;
                        break;
                    case PAPER:
                        myMove = SCISSORS;
                        break;
                    case SCISSORS:
                        myMove = ROCK;
                        break;
                    default:
                        System.out.println("Error");
                }
                total = total + 6 + myMove;
            }
        }
        return total;
    }
}
