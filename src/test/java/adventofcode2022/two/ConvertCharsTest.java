package adventofcode2022.two;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertCharsTest {

    @Test
    public void shouldConvertCharsInStringToInts() {
//        Given
        String filePath = "two/TwoRoundCombos.txt";
//        When
        ArrayList<String> strategyPerRound = ReadFile.readFile(filePath);
        ConvertChars convertChars = new ConvertChars();
        ArrayList<String> convertedStrategyPerRound = convertChars.convertCharsToInts(strategyPerRound);
//        Then
        assertThat(convertedStrategyPerRound).hasSize(2);
        assertThat(convertedStrategyPerRound).containsExactly("1 1", "1 1");

    }
}
