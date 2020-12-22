import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alex on 22.12.2020.
 */
public class Main {
    public static void main(String[] args) {
        String initial = "Some text";
        List<String> list = new ArrayList<>();
        while(true){
            String text = initial.concat(String.valueOf(new Random().nextDouble()));
            list.add(text.substring(0,4));
        }
    }
}