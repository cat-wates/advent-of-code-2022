package adventofcode2022.day2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadFileTest {

    @Test
    public void shouldReadTwoLinesOfInputFile() {
//        Given
        String filePath = "day2/TwoRoundCombos.txt";
//        When
        ArrayList<String> strategyPerRound  = ReadFile.readFile(filePath);
//        Then
        assertThat(strategyPerRound).hasSize(2);
        assertThat(strategyPerRound).containsExactly("A X", "B Y");
    }
}
