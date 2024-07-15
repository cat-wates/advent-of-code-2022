package adventofcode2022.day2;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static ArrayList<String> readFile(String filePath) { //input file into method
        ArrayList<String> list = new ArrayList<>(); //create String ArrayList called caloriesPerElf
        InputStream is = ClassLoader.getSystemResourceAsStream(filePath); //reads file as InputStream
        Scanner scanner = new Scanner(is); //scans through IS
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            list.add(next);
        }
        scanner.close();
        return list;
    }

}
