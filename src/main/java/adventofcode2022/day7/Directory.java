package adventofcode2022.day7;

import java.util.List;
import java.util.Objects;

public class Directory {

    String name;
    List<String> fileSizes;
    List<Directory> childDirectories;

    public Directory(String name, List<String> fileSizes, List<Directory> childDirectories) {
        this.name = name;
        this.fileSizes = fileSizes;
        this.childDirectories = childDirectories;
    }

    public void addFileSize(String fileSize) {
        fileSizes.add(fileSize);
    }

    public void addChildDirectory(Directory childDirectory) {
        childDirectories.add(childDirectory);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(name, directory.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //    public boolean equals(Object object) {
//        if (object == this) {
//            return true;
//        }
//        else if (object instanceof Directory dir && this.name.equals(dir.name)) {
//                return true;
//            }
//        else {
//            return false;
//        }
//    }

}
