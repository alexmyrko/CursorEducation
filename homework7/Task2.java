package homework7;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    Path path;
    {
        try {
            path = Paths.get(getClass().getResource("homework7.txt").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Task2 task2 = new Task2();
        stringDiscovery(task2.path);
    }

    public static void stringDiscovery(Path path) throws IOException {
        try {
            Set<String> wordsSet;
            Map<String, Integer> wordsMap = new HashMap<>();
            FileReader fileReader = new FileReader(path.toFile());
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String word = null;
                int count = 0;
                for (int i = 0; i < line.length(); i++) {
                    Character ch = line.charAt(i);
                    if (Character.isLetter(ch) || (ch == '-' && count != 0)) {
                        if (i == line.length() - 1){
                            word = line.substring(i - count, i + 1).toLowerCase();
                            putWordToMap(wordsMap, word);
                            count = 0;
                        } else count++;
                    } else if (!Character.isLetter(ch) && count != 0) {
                        word = line.substring(i - count, i).toLowerCase();
                        putWordToMap(wordsMap, word);
                        count = 0;
                    } else count = 0;
                }
            }
            wordsSet = new TreeSet<>(wordsMap.keySet());

            int size = Integer.MAX_VALUE;
            String shortest = null;
            for (String word : wordsSet){
                if (word.length() < size) {
                    shortest = word;
                    size = word.length();
                }
            }

            size = 0;
            String largest = null;
            for (String word : wordsSet){
                if (word.length() >= size) {
                    largest = word;
                    size = word.length();
                }
            }

            System.out.println("Shortest word: \"" + shortest + "\", repeats " + wordsMap.get(shortest) + " times");
            System.out.println("Largest word: \"" + largest + "\", repeats " + wordsMap.get(largest) + " times");

        } catch (FileNotFoundException e) {
            System.out.println("No such file found !");
            e.printStackTrace();
        }
    }

    private static void putWordToMap(Map<String, Integer> map, String word){
        if (map.containsKey(word)){
            map.put(word, map.get(word) + 1);
        } else map.put(word, 1);
    }
}
