package adventofcode2022.day5;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void oneStackNoItems() {
        assertThat(Main.readStacks(List.of(" 1 "))).containsExactly(new Stack<String>());
    }

    @Test
    void oneStackOneItem() {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        assertThat(Main.readStacks(
                List.of(
                        "[A]",
                        " 1 "
                ))).containsExactly(stack);
    }

    @Test
    void oneStackTwoItems() {
        Stack<String> stackOne = new Stack<>();
        stackOne.push("A");
        stackOne.push("B");
        assertThat(Main.readStacks(
                List.of(
                        "[B]",
                        "[A]",
                        " 1 "
                ))).containsExactly(stackOne);
    }

    @Test
    void twoStacksOneItem() {
        Stack<String> stackOne = new Stack<>();
        stackOne.push("A");
        Stack<String> stackTwo = new Stack<>();
        stackTwo.push("B");
        assertThat(Main.readStacks(List.of(
                "[A] [B]",
                " 1   2 "
        ))).containsExactly(stackOne, stackTwo);
    }
}
