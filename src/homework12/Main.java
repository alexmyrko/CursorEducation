package homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Path songFilePath;
    static Path badWordsFilePath;

    public static void main( String args[] ) throws IOException {
        try {
            songFilePath = Paths.get(Main.class.getResource("resources/song.txt").toURI());
            badWordsFilePath = Paths.get(Main.class.getResource("resources/badWords.txt").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        WordsProcessor processor = new WordsProcessor(badWordsFilePath);
        Map<String, Integer> allWords = processor.getAllWords(songFilePath);
        Map<String, Integer> censoredWords = processor.getCensoredWords(allWords);

        System.out.print("Enter deep for search of repeated words: ");
        int n = Integer.parseInt(reader.readLine());

        Map<String, Integer> mostOftenWords = processor.getWordsBySearchDeep(n, censoredWords);

        System.out.println(String.format("Most often %d repeated words are:" , n));
        for(Map.Entry<String, Integer> entry : mostOftenWords.entrySet()){
            System.out.println(String.format("%s - %d", entry.getKey(), entry.getValue()));
        }

        String[] array = processor.getBadWordsToArray(processor.badWords);
        System.out.println("Bad words in array: " + Arrays.toString(array));
    }
}
