package homework2;

import java.util.Arrays;

public class Task1 {
    private static Integer[] array1 = { 2,3,1,7,11};
    private static Integer[] array2 = { 2,-3,1,-7,11, -35};
    private static Integer[] array3 = { 2,-3, 2, 1, 0,11, 1};

    public static void main(String[] args) {
        System.out.println("Array " + Arrays.toString(array1) + " sorted in descent order: " + Arrays.toString(sort(array1)));
        System.out.println("Sum of positive numbers from array " + Arrays.toString(array2) + ": " + sumPositiveNumbers(array2));
        System.out.println("Average of a list of numbers in array " + Arrays.toString(array2) + ": " + averageNumber(array2));
        System.out.println("Replacing by 0 duplicated values from array: " + Arrays.toString(array3) + ". Result:" +
                Arrays.toString(replaceDuplicatedNumbersWithZero(array3)));
    }

    public static Integer[] sort(Integer[] arr){
        Integer[] tempArr = Arrays.copyOf(arr, arr.length);
        int counter;
        do{
            counter = 0;
            for (int i = 0; i < tempArr.length - 1; i++){
                if (tempArr[i+1] > tempArr[i]){
                    int temp = tempArr[i];
                    tempArr[i] = tempArr[i+1];
                    tempArr[i+1] = temp;
                    counter++;
                }
            }
        } while(counter > 0);
        return tempArr;
    }

    public static Integer sumPositiveNumbers(Integer[] arr){
        int sum = 0;
        for(Integer i : arr){
            if (i > 0)
                sum += i;
        }
        return sum;
    }

    public static Integer averageNumber(Integer[] arr){
        int sum = 0;
        for(Integer i : arr){
            sum += i;
        }
        return sum / arr.length;
    }

    public static Integer[] replaceDuplicatedNumbersWithZero(Integer[] arr){
        Integer[] tempArr = Arrays.copyOf(arr, arr.length);
        for(int i = 0; i < tempArr.length; i++){
            for(int j = 0; j < tempArr.length; j++){
                if (tempArr[i] == tempArr[j] && i != j)
                    tempArr[j] = 0;
            }
        }
        return tempArr;
    }
}
