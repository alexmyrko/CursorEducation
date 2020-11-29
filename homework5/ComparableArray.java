package homework5;

import java.util.Arrays;

public class ComparableArray<T extends Comparable> {
    private T[] array;

    public ComparableArray(T[] array){
        this.array = array;
    }

    public T getLargest(){
        T max = array[0];
        for (T element : array)
            if (element.compareTo(max) > 0)
                max = element;
        return max;
    }

    public T getSmallest(){
        T min = array[0];
        for (T element : array)
            if (element.compareTo(min) < 0)
                min = element;
        return min;
    }

    public void showSmallestAndLargest(){
        System.out.println("Array: " + Arrays.toString(array) + "\n" + "Largest element: " + getLargest() + "\n" + "Smallest element: " + getSmallest() + "\n");
    }
}
