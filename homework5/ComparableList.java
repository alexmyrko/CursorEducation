package homework5;

import java.util.ArrayList;
import java.util.List;

public class ComparableList<T extends Comparable>{
    List<T> list = new ArrayList<>();

    public void add(T element){
        list.add(element);
    }


    public T getLargest(){
        T max = list.get(0);
        for (T element : list)
            if (element.compareTo(max) > 0)
                max = element;
        return max;
    }

    public T getSmallest(){
        T min = list.get(0);
        for (T element : list)
            if (element.compareTo(min) < 0)
                min = element;
        return min;
    }

    public void showSmallestAndLargest(){
        System.out.println("List: " + list + "\n" + "Largest element: " + getLargest() + "\n" + "Smallest element: " + getSmallest() + "\n");
    }
}