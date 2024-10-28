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
        Directory actual = fsp.parse(input);
        Directory expected = new Directory("abc", new ArrayList<>());
//        Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldParseDirectoryContainingOneFile() {
        //        Given
        String input = "$ cd abc\n$ ls\n123 def";
//        When
        FileSystemParser fsp = new FileSystemParser();
        Directory actual = fsp.parse(input);
        Directory expected = new Directory("abc", List.of("123"));
//        Then
        assertThat(actual).isEqualTo(expected);
        assertThat(actual.fileSizes).isEqualTo(expected.fileSizes);
    }

    @Test
    public void shouldIgnoreUnnecessaryCommandLines() {

    }
}
