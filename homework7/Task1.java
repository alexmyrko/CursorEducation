package homework7;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        stringDiscovery("A piece of Text, which has digits like 25 and 37. А тепер, мабуть, трішки кирилиці:) The end!");
    }

    public static void stringDiscovery(String text) {
        Map<Character, Integer> letters = new HashMap<>();
        int digits = 0;
        int spaces = 0;
        int punctuation = 0;
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.toLowerCase().charAt(i);
            if (Character.isLetter(ch)) {
                if (letters.containsKey(ch))
                    letters.put(ch, letters.get(ch) + 1);
                else letters.put(ch, 1);
            }
            else if (Character.isDigit(ch))
                digits++;
            else if (Character.isSpaceChar(ch))
                spaces++;
        }

        Pattern pattern = Pattern.compile("[\\p{P}\\p{S}]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            punctuation++;

        System.out.println("Text: " + text);
        System.out.println("Letters: " + letters);
        System.out.println("Letters: " + letters.size());
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Punctuation marks: " + punctuation);
    }
}
