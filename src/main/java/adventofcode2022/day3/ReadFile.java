package adventofcode2022.day3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static ArrayList<String> readFile(String filePath) { //input file into method
        ArrayList<String> rucksacks = new ArrayList<>(); //create String ArrayList called rucksacks
        InputStream is = ClassLoader.getSystemResourceAsStream(filePath); //reads file as InputStream
        Scanner scanner = new Scanner(is); //scans through IS
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            rucksacks.add(next);
        }
        scanner.close();
        return rucksacks;
    }

}
