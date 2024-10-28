package adventofcode2022.day7;

import java.util.ArrayList;
import java.util.List;

public class FileSystemParser {


    public Directory parse(String input) {
        List<Directory> listOfDirectories = new ArrayList<>();
        Directory directory = null;
        String[] lines = input.split("\n"); //array of strings split by line
        for (String line : lines) { //for every line
            if (line.startsWith("$ cd ") && line.charAt(5) != '.') { //if the line starts with "$ cd " and isn't "$ cd .."
                String dir = input.substring(5, input.indexOf("\n$ ls")); //substring from end of cd to before next line, i.e. name of directory
                directory = new Directory(dir, new ArrayList<>());
            }
            if (Character.isDigit(line.charAt(0))) {
                directory.fileSizes = createFileSizes(lines);


                ///add finished directory to list?
            }
        }
        return directory;
    }

    private List<String> createFileSizes(String[] lines) {
        List<String> fileSizes = new ArrayList<>();
        //create list
        //for every line that isn't "cd", extract numbers (use regex maybe?)
        //add them to the list

        return fileSizes;
    }
}
