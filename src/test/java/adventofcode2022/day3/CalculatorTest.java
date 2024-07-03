package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void shouldTakeListOfStringNumbersAndCalculateSum() {
//        Given
        ArrayList<String> priorityTest = new ArrayList<>();
        priorityTest.add("1");
        priorityTest.add("52");
//        When
        Calculator calc = new Calculator(priorityTest);
        int total = calc.calculateTotal(priorityTest);
//        Then
        assertThat(total).isEqualTo(53);
    }
}
