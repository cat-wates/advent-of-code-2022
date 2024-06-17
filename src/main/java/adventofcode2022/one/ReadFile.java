package adventofcode2022.one;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<Integer> readFile(String filePath) { //input file into method
        ArrayList<Integer> calories = new ArrayList<>(); //create String ArrayList called caloriesPerElf
        InputStream is = ClassLoader.getSystemResourceAsStream(filePath); //reads file as InputStream
        Scanner scanner = new Scanner(is); //scans through IS
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            if (next.isEmpty()) {
                calories.add(0);
            }
            else {
                calories.add(Integer.parseInt(next));
            }
        }
//        while (scanner.hasNext()) {
//            int elfTotal = 0;
//            String next = scanner.next();
//            elfTotal += Integer.parseInt(next);
//            caloriesPerElf.add(elfTotal);
//        }

        scanner.close();
        return calories;
    }
}