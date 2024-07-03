package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CommonItemFinderTest {

    @Test
    public void shouldCompareTwoCompartmentsAndFindACommonItem() {
//        Given
        String rucksackContents = "abcxxdef";
//        When
        Rucksack rucksack = new Rucksack(rucksackContents);
        rucksack.splitRucksackIntoCompartments(rucksackContents);
        CommonItemFinder cif = new CommonItemFinder(rucksack);
        char commonItem = cif.compareCompartments(rucksack.compartmentOne, rucksack.compartmentTwo);
//        Then
        assertThat(commonItem).isEqualTo('x');
    }

    @Test
    public void shouldCompareTwoCompartmentsAndNotFindCommonItem() {
//        Given
        String rucksackContents = "abcdef";
//        When
        Rucksack rucksack = new Rucksack(rucksackContents);
        rucksack.splitRucksackIntoCompartments(rucksackContents);
        CommonItemFinder cif = new CommonItemFinder(rucksack);
        char commonItem = cif.compareCompartments(rucksack.compartmentOne, rucksack.compartmentTwo);
//        Then
        assertThat(commonItem).isEqualTo('\u0000'); //null char
    }
}
