package adventofcode2022.day4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ElfPairTest {

    @Test
    public void shouldSplitAStringIntoTwoSubstrings() {
//        Given
        String elfPair = "61-78,61-77";
//        When
        ElfPair ep = new ElfPair(elfPair);
//        Then
        assertThat(ep.elfOne).isEqualTo("61-78");
        assertThat(ep.elfTwo).isEqualTo("61-77");
    }

    @Test
    public void shouldSplitAStringIntoTwoElementsOfAStringArray() {
//        Given
        String elfPair = "61-78,61-77";
//        When
        ElfPair ep = new ElfPair(elfPair);
        String[] elfOneBounds = ep.splitIntoBounds(ep.elfOne);
//        Then
        assertThat(elfOneBounds).contains("61", "78");
        assertThat(elfOneBounds).hasSize(2);
    }

    @Test
    public void shouldCheckWhetherACompleteDuplicateResultsInTrue() {
//        Given
        String elfPair = "61-78,61-77";
//        When
        ElfPair ep = new ElfPair(elfPair);
        String[] elfOneBounds = ep.splitIntoBounds(ep.elfOne);
        String[] elfTwoBounds = ep.splitIntoBounds(ep.elfTwo);
        boolean isEncapsulatedDuplicate = ep.completeDuplicateChecker(elfOneBounds, elfTwoBounds);
//        Then
        assertThat(isEncapsulatedDuplicate).isEqualTo(true);
    }

    @Test
    public void shouldCheckWhetherNoCompleteDuplicateResultsInFalse() {
//        Given
        String elfPair = "61-62,63-77";
//        When
        ElfPair ep = new ElfPair(elfPair);
        String[] elfOneBounds = ep.splitIntoBounds(ep.elfOne);
        String[] elfTwoBounds = ep.splitIntoBounds(ep.elfTwo);
        boolean isEncapsulatedDuplicate = ep.completeDuplicateChecker(elfOneBounds, elfTwoBounds);
//        Then
        assertThat(isEncapsulatedDuplicate).isEqualTo(false);
    }

    @Test
    public void shouldCheckWhetherAnyDuplicateWillResultInTrue() {
//        Given
        String elfPair = "61-78,61-77";
//        When
        ElfPair ep = new ElfPair(elfPair);
        String[] elfOneBounds = ep.splitIntoBounds(ep.elfOne);
        String[] elfTwoBounds = ep.splitIntoBounds(ep.elfTwo);
        boolean isAnyDuplicate = ep.anyDuplicateChecker(elfOneBounds, elfTwoBounds);
//        Then
        assertThat(isAnyDuplicate).isEqualTo(true);
    }

    @Test
    public void shouldCheckWhetherNoDuplicatesWillResultInFalse() {
//        Given
        String elfPair = "61-62,63-77";
//        When
        ElfPair ep = new ElfPair(elfPair);
        String[] elfOneBounds = ep.splitIntoBounds(ep.elfOne);
        String[] elfTwoBounds = ep.splitIntoBounds(ep.elfTwo);
        boolean isAnyDuplicate = ep.anyDuplicateChecker(elfOneBounds, elfTwoBounds);
//        Then
        assertThat(isAnyDuplicate).isEqualTo(false);
    }
}

