package adventofcode2022;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadFileTest {

    @Test
    public void shouldReadTwoLinesOfInputFile() throws IOException {
//        Given
        String filePath = "TwoCalorieVals.txt";
//        When
        ArrayList<Integer> caloriesForElf1  = ReadFile.readFile(filePath);
//        Then
        assertThat(caloriesForElf1).hasSize(2);
        assertThat(caloriesForElf1).containsExactly(7844, 1892);
    }

    @Test
    public void shouldReadFourLinesOfInputFileWithBlankspace() throws IOException {
//        Given
        String filePath = "ThreeCalorieVals.txt";
//        When
        ArrayList<Integer> listOfCals = ReadFile.readFile(filePath);
//        Then
//        assertEquals(listOfCals.get(2), 0);
//        assertEquals(listOfCals.size(), 4);
    }
}

