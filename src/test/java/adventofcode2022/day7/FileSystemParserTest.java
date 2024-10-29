package adventofcode2022.day7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FileSystemParserTest {

    @Test
    public void shouldParseEmptyDirectory() {
//        Given
        String input = "$ cd abc\n$ ls";
//        When
        FileSystemParser fsp = new FileSystemParser();
        List<Directory> actual = fsp.parse(input);
        Directory expected = new Directory("abc", new ArrayList<>(), new ArrayList<>());
//        Then
        assertThat(actual.get(0)).isEqualTo(expected);
    }

    @Test
    public void shouldParseDirectoryContainingOneFile() {
        //        Given
        String input = "$ cd abc\n$ ls\n123 def";
//        When
        FileSystemParser fsp = new FileSystemParser();
        List<Directory> actual = fsp.parse(input);
        Directory expected = new Directory("abc", List.of("123"), new ArrayList<>());
//        Then
        assertThat(actual.get(0)).isEqualTo(expected);
        assertThat(actual.get(0).fileSizes).isEqualTo(expected.fileSizes);
    }

    @Test
    public void shouldParseDirectoryContainingTwoFiles() {
        //        Given
        String input = "$ cd abc\n$ ls\n123 def\n456 ghi";
//        When
        FileSystemParser fsp = new FileSystemParser();
        List<Directory> actual = fsp.parse(input);
        Directory expected = new Directory("abc", List.of("123", "456"), new ArrayList<>());
//        Then
        assertThat(actual.get(0)).isEqualTo(expected);
        assertThat(actual.get(0).fileSizes).isEqualTo(expected.fileSizes);
    }

    @Test
    public void shouldParseTwoDirectoriesWithFiles() {
        //        Given
        String input = "$ cd abc\n$ ls\n123 def\n$ cd ghi\n$ ls\n456 jkl";
//        When
        FileSystemParser fsp = new FileSystemParser();
        List<Directory> actual = fsp.parse(input);
        Directory expectedDir1 = new Directory("abc", List.of("123"), new ArrayList<>());
        Directory expectedDir2 = new Directory("ghi", List.of("456"), new ArrayList<>());
//        Then
        assertThat(actual.get(0)).isEqualTo(expectedDir1);
        assertThat(actual.get(1)).isEqualTo(expectedDir2);
        assertThat(actual.size()).isEqualTo(2);
    }

    @Test
    public void shouldParseADirectoryWhichContainsAChildDirectory() {
        //        Given
        String input = "$ cd abc\n$ ls\ndir def";
//        When
        FileSystemParser fsp = new FileSystemParser();
        List<Directory> actual = fsp.parse(input);
        Directory expectedDir1 = new Directory("abc", new ArrayList<>(), List.of(new Directory("def", new ArrayList<>(), new ArrayList<>())));
//        Then
        assertThat(actual.get(0)).isEqualTo(expectedDir1);
        assertThat(actual.size()).isEqualTo(1); //it doesn't store child directory until it is called upon by "$ cd " rule...is this right?
    }

    @Test
    public void shouldParseADirectoryWhichContainsAChildDirectoryAndFileSizes() {
        //        Given
        String input = "$ cd abc\n$ ls\ndir def\n$ cd def\n$ ls\n123 ";
//        When
        FileSystemParser fsp = new FileSystemParser();
        List<Directory> actual = fsp.parse(input);
        Directory expectedDir1 = new Directory("abc", new ArrayList<>(), List.of(new Directory("def", List.of("123"), new ArrayList<>())));
        Directory expectedDir2 = new Directory("def", List.of("123"), new ArrayList<>());
//        Then
        assertThat(actual.get(0)).isEqualTo(expectedDir1);
        assertThat(expectedDir1.childDirectories.get(0)).isEqualTo(expectedDir2);
        assertThat(actual.get(1)).isEqualTo(expectedDir2);
        assertThat(actual.size()).isEqualTo(2);
    }

    @Test
    public void shouldParseThreeNestedDirectoriesWhichContainFiles() {
        //        Given
        String input = "$ cd abc\n$ ls\ndir def\n123 abc\n$ cd def\n$ ls\n456 def\ndir ghi";
//        When
        FileSystemParser fsp = new FileSystemParser();
        List<Directory> actual = fsp.parse(input);
        Directory expectedDir1 = new Directory("abc", new ArrayList<>(), List.of(new Directory("def",
                List.of("123"), List.of(new Directory("ghi", new ArrayList<>(), new ArrayList<>())))));
        Directory expectedDir2 = new Directory("def", List.of("123"), List.of(new Directory("ghi",
                new ArrayList<>(), new ArrayList<>())));
        Directory nestedExpectedDir3 = new Directory("ghi", new ArrayList<>(), new ArrayList<>());
//        Then
        assertThat(actual.get(0)).isEqualTo(expectedDir1);
        assertThat(expectedDir1.childDirectories.get(0)).isEqualTo(expectedDir2);
        assertThat(actual.get(1)).isEqualTo(expectedDir2);
        assertThat(expectedDir2.childDirectories.get(0)).isEqualTo(nestedExpectedDir3);
        assertThat(actual.size()).isEqualTo(2);
    }

    }



//    @Test
//    public void shouldIgnoreUnnecessaryCommandLines() {
//
//    }
//}
