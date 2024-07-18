package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BadgeFinderTest {

    @Test
    public void shouldFindCommonCharInThreeStrings() {
//        Given
        String filePath = "day3/ThreeElves.txt";
        ArrayList<String> rucksacks = adventofcode2022.day2.ReadFile.readFile(filePath);
//        When
        BadgeFinder bf = new BadgeFinder(rucksacks);
        ArrayList<Character> badges = bf.findBadge(rucksacks);
//        Then
        assertThat(badges).containsExactly('d');
    }

    @Test
    public void shouldFindTwoCommonCharsInSixStrings() {
//        Given
        String filePath = "day3/SixElves.txt";
        ArrayList<String> rucksacks = adventofcode2022.day2.ReadFile.readFile(filePath);
//        When
        BadgeFinder bf = new BadgeFinder(rucksacks);
        ArrayList<Character> badges = bf.findBadge(rucksacks);
//        Then
        assertThat(badges).containsExactly('d', 'g');
    }
}
