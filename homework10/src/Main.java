import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static int number;
    public static void main(String[] args) {
        gradation();
        System.out.println();
        teeing(new ArrayList<>(Arrays.asList(1, 1)));
        teeing(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        teeing(new ArrayList<>(Arrays.asList(1, 2, 2, 3)));
    }

    public static void gradation(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
        switch (number){
            case 0,1,2,3,4 -> System.out.println("Very bad");
            case 5      -> System.out.println("Bad");
            case 6      -> System.out.println("Acceptable");
            case 7,8    -> System.out.println("Good");
            case 9,10   -> System.out.println("Well");
        }
    }

    public static void teeing(List<Integer> list){
        Double uniquePercentage = list.stream().collect(Collectors.teeing(
               Collectors.counting(),
                Collectors.toSet(),
                (count, set) ->  set.size() / count.doubleValue()
                ));
        System.out.println("Percentage of unique numbers in list " + list + " is " + (int) (uniquePercentage * 100) + "%");
    }
}
