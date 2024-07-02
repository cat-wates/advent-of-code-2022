package adventofcode2022.day2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertCharsTest {

    @Test
    public void shouldConvertAToOne() {
//        Given
        ArrayList<String> singleChar = new ArrayList<>();
        singleChar.add("A");
//        When
        ConvertChars convertChars = new ConvertChars();
        ArrayList<String> convertedStrategyPerRound = convertChars.convertCharsToInts(singleChar);
//        Then
        assertThat(convertedStrategyPerRound).hasSize(1);
        assertThat(convertedStrategyPerRound).containsExactly("1");
    }

    @Test
    public void shouldConvertXToOne() {
//        Given
        ArrayList<String> singleChar = new ArrayList<>();
        singleChar.add("X");
//        When
        ConvertChars convertChars = new ConvertChars();
        ArrayList<String> convertedStrategyPerRound = convertChars.convertCharsToInts(singleChar);
//        Then
        assertThat(convertedStrategyPerRound).hasSize(1);
        assertThat(convertedStrategyPerRound).containsExactly("1");
    }

    @Test
    public void shouldConvertBToTwo() {
//        Given
        ArrayList<String> singleChar = new ArrayList<>();
        singleChar.add("B");
//        When
        ConvertChars convertChars = new ConvertChars();
        ArrayList<String> convertedStrategyPerRound = convertChars.convertCharsToInts(singleChar);
//        Then
        assertThat(convertedStrategyPerRound).hasSize(1);
        assertThat(convertedStrategyPerRound).containsExactly("2");
    }

    @Test
    public void shouldConvertYToTwo() {
//        Given
        ArrayList<String> singleChar = new ArrayList<>();
        singleChar.add("Y");
//        When
        ConvertChars convertChars = new ConvertChars();
        ArrayList<String> convertedStrategyPerRound = convertChars.convertCharsToInts(singleChar);
//        Then
        assertThat(convertedStrategyPerRound).hasSize(1);
        assertThat(convertedStrategyPerRound).containsExactly("2");
    }

    @Test
    public void shouldConvertCToThree() {
//        Given
        ArrayList<String> singleChar = new ArrayList<>();
        singleChar.add("C");
//        When
        ConvertChars convertChars = new ConvertChars();
        ArrayList<String> convertedStrategyPerRound = convertChars.convertCharsToInts(singleChar);
//        Then
        assertThat(convertedStrategyPerRound).hasSize(1);
        assertThat(convertedStrategyPerRound).containsExactly("3");
    }

    @Test
    public void shouldConvertZToThree() {
//        Given
        ArrayList<String> singleChar = new ArrayList<>();
        singleChar.add("Z");
//        When
        ConvertChars convertChars = new ConvertChars();
        ArrayList<String> convertedStrategyPerRound = convertChars.convertCharsToInts(singleChar);
//        Then
        assertThat(convertedStrategyPerRound).hasSize(1);
        assertThat(convertedStrategyPerRound).containsExactly("3");
    }
}
