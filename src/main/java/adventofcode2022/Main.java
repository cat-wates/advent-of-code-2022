package adventofcode2022;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "CalorieList.txt"; //define file as variable
        ArrayList<Integer> calories = ReadFile.readFile(filePath);
        System.out.println(calories);
    }
}

/* Plan of action
1. Read in file
2. Use scanner to add each element in a block of lines to a running total for each elf
3.
 */