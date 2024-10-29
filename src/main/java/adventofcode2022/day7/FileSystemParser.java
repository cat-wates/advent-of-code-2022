package adventofcode2022.day7;

import java.util.ArrayList;
import java.util.List;

public class FileSystemParser {


    public List<Directory> parse(String input) {
        List<Directory> directories = new ArrayList<>();
        Directory directory = null;
        String[] lines = input.split("\n"); //array of strings split by line
        for (String line : lines) { //for every line
            if (line.startsWith("$ cd ") && line.charAt(5) != '.') { //if the line starts with "$ cd " and isn't "$ cd .."
                if (directory != null) {
                    directories.add(directory);
                }
                String dir = line.substring(5); //substring from end of cd to before next line, i.e. name of directory
                directory = new Directory(dir, new ArrayList<>(), new ArrayList<>());
            }
            if (Character.isDigit(line.charAt(0))) {
                String[] digits = line.split(" ");
                directory.addFileSize(digits[0]);
            }
            if (line.startsWith("dir ")) {
                String[] childDirectories = line.split(" ");
                directory.addChildDirectory(new Directory(childDirectories[1], new ArrayList<>(), new ArrayList<>()));
            }
        }
        directories.add(directory);
        return directories;
    }

//    public Integer doSomething(Integer index, List<String> list) {
//// create parent directory
////        add file sizes
////        for each directory call the same function
////        return directory when complete
//    }
}
