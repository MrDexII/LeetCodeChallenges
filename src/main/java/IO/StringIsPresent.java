package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StringIsPresent {

    public static void main(String[] args) {

        Path path = Paths.get("E:\\Programing\\java\\LeetCodeChallenges\\src\\main\\java\\IO\\file.txt");
        boolean stringPresent = false;
        try {
            Stream<String> lines = Files.lines(path);
            stringPresent = isStringPresent(lines, "aa");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("stringPresent = " + stringPresent);
    }

    private static boolean isStringPresent(Stream<String> stringStream, String string) {
        return stringStream.anyMatch(line -> line.contains(string));
    }
}
