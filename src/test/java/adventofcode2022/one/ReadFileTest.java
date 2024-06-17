package adventofcode2022.one;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadFileTest {

    @Test
    public void shouldReadTwoLinesOfInputFile() {
//        Given
        String filePath = "one/TwoCalorieVals.txt";
//        When
        ArrayList<Integer> caloriesForElf1  = ReadFile.readFile(filePath);
//        Then
        assertThat(caloriesForElf1).hasSize(2);
        assertThat(caloriesForElf1).containsExactly(7844, 1892);
    }

    @Test
    public void shouldReadFourLinesOfInputFileWithBlankspace() {
//        Given
        String filePath = "one/ThreeCalorieVals.txt";
//        When
        ArrayList<Integer> listOfCals = ReadFile.readFile(filePath);
//        Then
        assertThat(listOfCals).hasSize(4);
        assertThat(listOfCals).containsExactly(1000, 1500, 0, 500);
    }
}

