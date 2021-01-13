package homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static int number;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("\nChoose exercise [uniqueNumbers, marks] or type 'q' for exit:");
            String choice = reader.readLine();
            switch (choice){
                case "uniqueNumbers" -> teeing();
                case "marks"    ->  gradation();
                case  "q"  ->   System.exit(0);
            }
        }
    }

    public static void gradation(){
        while(true) {
            try {
                System.out.print("Please enter your mark (from 1 to 10): ");
                number = Integer.parseInt(reader.readLine());
                if (number < 0 || number > 10)
                    System.out.println("Wrong input");
                else break;
            } catch (Exception e) {
                System.out.println("Not a number! Try again !");
            }
        }
        System.out.print("Text mark is: ");
        String textMark = switch (number){
            case 0,1,2,3,4 -> "Very bad";
            case 5      -> "Bad";
            case 6      -> "Acceptable";
            case 7,8    -> "Good";
            case 9,10   -> "Well";
            default -> "No value for such number";
        };
        System.out.println(textMark);
    }

    public static void teeing() throws IOException {
        List<Integer> numbers = new ArrayList<>();
        while(true) {
            System.out.println("Enter set of comma separated numbers:");
            String[] elements = reader.readLine().split(",");
            try {
                for (String s : elements)
                    numbers.add(Integer.parseInt(s.trim()));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong input!");
            }
        }

        Double uniquePercentage = numbers.stream().collect(Collectors.teeing(
               Collectors.counting(),
                Collectors.toSet(),
                (count, set) ->  set.size() / count.doubleValue()
                ));
        System.out.println("Percentage of unique numbers in list " + numbers + " is " + (int) (uniquePercentage * 100) + "%");
    }
}
