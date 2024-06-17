package adventofcode2022.two;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static ArrayList<String> readFile(String filePath) { //input file into method
        ArrayList<String> strategyPerRound = new ArrayList<>(); //create String ArrayList called caloriesPerElf
        InputStream is = ClassLoader.getSystemResourceAsStream(filePath); //reads file as InputStream
        Scanner scanner = new Scanner(is); //scans through IS
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            strategyPerRound.add(next);
        }
        scanner.close();
        return strategyPerRound;
    }

}
