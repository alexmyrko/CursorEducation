package homework5;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    List<T> list = new ArrayList<>();

    public void add(T number) {
        list.add(number);
    }

    public T getLargest() {
        T max = list.get(0);
        for (T element : list) {
            if (element.doubleValue() > max.doubleValue())
                max = element;
        }
        return max;
    }

    public T getSmallest() {
        T min = list.get(0);
        for (T element : list) {
            if (element.doubleValue() < min.doubleValue())
                min = element;
        }
        return min;
    }

    public void showSmallestAndLargest(){
        System.out.println("List: " + list + "\n" + "Largest element: " + getLargest() + "\n" + "Smallest element: " + getSmallest() + "\n");
    }
}
