package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PriorityFinderTest {

    @Test
    public void shouldTakeAListContainingTheFirstCharAndConvertTo1() {
//        Given
        ArrayList<Character> testChars = new ArrayList<>();
        testChars.add('a');
//        When
        PriorityFinder pf = new PriorityFinder(testChars);
        ArrayList<Integer> priorityList = pf.replaceCharWithInt(testChars);
        System.out.println(priorityList);
//        Then
        assertThat(priorityList).contains(1);
    }

    @Test
    public void shouldTakeAListContainingTheLastCharAndConvertTo52() {
//        Given
        ArrayList<Character> testChars = new ArrayList<>();
        testChars.add('Z');
//        When
        PriorityFinder pf = new PriorityFinder(testChars);
        ArrayList<Integer> priorityList = pf.replaceCharWithInt(testChars);
        System.out.println(priorityList);
//        Then
        assertThat(priorityList).contains(52);
    }
}
