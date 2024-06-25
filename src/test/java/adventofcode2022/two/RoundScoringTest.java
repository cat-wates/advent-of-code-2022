package adventofcode2022.two;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RoundScoringTest {

    //part A
    @Test
    public void shouldReturnScoreTotalForOneAndOne() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("1 1");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 4);
    }

    @Test
    public void shouldReturnScoreTotalForOneAndTwo() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("1 2");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 8);
    }

    @Test
    public void shouldReturnScoreTotalForOneAndThree() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("1 3");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 3);
    }

    @Test
    public void shouldReturnScoreTotalForTwoAndOne() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("2 1");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 1);
    }

    @Test
    public void shouldReturnScoreTotalForTwoAndTwo() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("2 2");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 5);
    }

    @Test
    public void shouldReturnScoreTotalForTwoAndThree() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("2 3");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 9);
    }

    @Test
    public void shouldReturnScoreTotalForThreeAndOne() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("3 1");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 7);
    }

    @Test
    public void shouldReturnScoreTotalForThreeAndTwo() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("3 2");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 2);
    }

    @Test
    public void shouldReturnScoreTotalForThreeAndThree() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("3 3");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 6);
    }

    //part B
    @Test
    public void shouldReturnNewScoreTotalForOneAndOne() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("1 1");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 3);
    }

    @Test
    public void shouldReturnNewScoreTotalForOneAndTwo() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("1 2");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 4);
    }

    @Test
    public void shouldReturnNewScoreTotalForOneAndThree() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("1 3");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 8);
    }

    @Test
    public void shouldReturnNewScoreTotalForTwoAndOne() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("2 1");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 1);
    }

    @Test
    public void shouldReturnNewScoreTotalForTwoAndTwo() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("2 2");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 5);
    }

    @Test
    public void shouldReturnNewScoreTotalForTwoAndThree() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("2 3");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 9);
    }

    @Test
    public void shouldReturnNewScoreTotalForThreeAndOne() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("3 1");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 2);
    }

    @Test
    public void shouldReturnNewScoreTotalForThreeAndTwo() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("3 2");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 6);
    }

    @Test
    public void shouldReturnNewScoreTotalForThreeAndThree() {
//        Given
        ArrayList<String> strategyPerRound = new ArrayList<>();
        strategyPerRound.add("3 3");
//        When
        RoundScoring rs = new RoundScoring();
        int total = rs.calculateEnhancedRoundTotals(strategyPerRound);
//        Then
        assertThat(total).isEqualTo((Integer) 7);
    }
}
