package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RucksackTest {

    @Test
    public void shouldSplitRucksackInstanceIntoTwoCompartments() {
//        Given
        String rucksackContents = "abcdef";
//        When
        Rucksack rucksack = new Rucksack(rucksackContents);
        rucksack.splitRucksackIntoCompartments(rucksackContents);
//        Then
        assertThat(rucksack.compartmentOne).isEqualTo("abc");
        assertThat(rucksack.compartmentTwo).isEqualTo("def");
        assertThat(rucksack.compartmentOne.length()).isEqualTo(rucksack.compartmentTwo.length());
    }

}
