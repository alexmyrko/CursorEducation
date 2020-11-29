package homework6.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTasks implements Cloneable{
    public static List<String> list = new ArrayList<>();
    public static List<String> list2 = new ArrayList<>();

    public void exercise1() {
        System.out.println("Exercise 1. Write a Java program to create a new array list, add some colors (string) and print out the collection ");
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Blue");
        list.add("Yellow");
        list.add("Red");
        System.out.println("Creating new Arraylist with few elements: " + list + "\n");
    }

    public void exercise2() {
        System.out.println("Exercise 2. Write a Java program to iterate through all elements in a array list");
        list.add("Orange");
        list.add("Blue");
        list.add("Red");
        System.out.println("Iterate through all elements in list:");
        for (String s : list)
            System.out.println(s);
        System.out.println();
    }

    public void exercise3() {
        System.out.println("Exercise 3. Write a Java program to insert an element into the array list at the first position.");
        System.out.println("Origin list: " + list);
        String element = "Green";
        list.add(0, element);
        System.out.println("List after inserting element " + element + " at first position: " + list + "\n");
    }

    public void exercise4() {
        System.out.println("Exercise 4. Write a Java program to retrieve an element (at a specified index) from a given array list.");
        int index = 3;
        System.out.println("Origin list: " + list);
        System.out.println("Retrieved element: " + list.get(index) + "\n");
    }

    public void exercise5() {
        System.out.println("Exercise 5. Write a Java program to update specific array element by given element.");
        int index = 2;
        String newColor = "Black";
        System.out.println("Origin list: " + list);
        list.set(index, newColor);
        System.out.println("List after updating " + index + " element with " + newColor + ": " + list + "\n");
    }

    public void exercise6() {
        System.out.println("Exercise 6. Write a Java program to remove the third element from a array list.");
        int index = 3;
        System.out.println("Origin list is: " + list);
        list.remove(index);
        System.out.println("List after removing element at " + index + ": " + list + "\n");
    }

    public void exercise7() {
        System.out.println("Exercise 7. Write a Java program to search an element in a array list.");
        String searched = "Orange";
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(searched))
                System.out.println("Element " + searched + " is present in list " + list);
        System.out.println();
    }

    public void exercise8() {
        System.out.println("Exercise 8. Write a Java program to sort a given array list.");
        System.out.println("Origin list is: " + list);
        Collections.sort(list);
        System.out.println("Sorted list: " + list + "\n");
    }

    public void exercise9() {
        System.out.println("Exercise 9. Write a Java program to copy one array list into another.");
        List<String> list2 = new ArrayList<>();
        for (String s : list)
            list2.add(s);
        System.out.println("Origin list is: " + list);
        System.out.println("Copied list is: " + list2 + "\n");
    }

    public void exercise10() {
        System.out.println("Exercise 10. Write a Java program to shuffle elements in a array list.");
        System.out.println("Origin list is: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list + "\n");
    }

    public void exercise11() {
        System.out.println("Exercise 11. Write a Java program to reverse elements in a array list.");
        System.out.println("Origin list is: " + list);
        Collections.reverse(list);
        System.out.println("Reversed list: " + list + "\n");
    }

    public void exercise12() {
        System.out.println("Exercise 12. Write a Java program to extract a portion of a array list.");
        int startIndex = 0;
        int endIndex = 2;
        List<String> subList = list.subList(startIndex, endIndex);
        System.out.println("Sublist from index " + startIndex + " to " + endIndex + " is " + subList + "\n");
    }

    public void exercise13() {
        System.out.println("Exercise 13. Write a Java program to compare two array lists.");
        list2.add("Orange");
        list2.add("Green");
        list2.add("Black");
        boolean isTheSame = true;
        if (list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++)
                if (!list.get(i).equals(list2.get(i)))
                    isTheSame = false;
        } else isTheSame = false;
        System.out.println("Are list " + list + "\nand\n" + list2 + " identical? \nAnswer: " + isTheSame + "\n");
    }

    public void exercise14() {
        System.out.println("Exercise 14. Write a Java program of swap two elements in an array list.");
        int index1 = 0;
        int index2 = 2;
        System.out.println("Origin list: " + list);
        Collections.swap(list, index1, index2);
        System.out.println("List after swapping elements at indexes " + index1 + " and " + index2 + " :" + list + "\n");
    }

    public void exercise15() {
        System.out.println("Exercise 15. Write a Java program to join two array lists.");
        List<String> list1 = new ArrayList<>();
        list1.addAll(list);
        list1.addAll(list2);
        System.out.println("Joined " + list + " and " + list2 + " : " + list1 + "\n");
    }

    public void exercise16() {
        System.out.println("Exercise 16. Write a Java program to clone an array list to another array list.");
        System.out.println("Origin ArrayList: " + list);
        ArrayList<String> cloned = (ArrayList<String>) ((ArrayList<String>)list).clone();
        System.out.println("Cloned Arraylist: " + cloned + "\n");
    }

    public void exercise17() {
        System.out.println("Exercise 17. Write a Java program to empty an array list.");
        list2.clear();
        System.out.println("Check if list2 is empty: " + list2 + "\n");
    }

    public void exercise18() {
        System.out.println("Exercise 18. Write a Java program to test an array list is empty or not.");
        System.out.println("Check if list " + list + " is empty: " + list.isEmpty());
        System.out.println("Check if list " + list2 + " is empty: " + list2.isEmpty() + "\n");
    }

    public void exercise19() {
        System.out.println("Exercise 19. Write a Java program to trim the capacity of an array list the current list size.");
        ArrayList<String> toTrimList = new ArrayList<>(list);
        toTrimList.trimToSize();
        System.out.println("Trimmed to size list: " + toTrimList + "\n");
    }

    public void exercise20() {
        System.out.println("Exercise 20. Write a Java program to increase the size of an array list.");
        ArrayList<String> newCapacityList = new ArrayList<>(list);
        newCapacityList.ensureCapacity(10);
        System.out.println("New capacity list: " + newCapacityList + "\n");
    }

    public void exercise21() {
        System.out.println("Exercise 21. Write a Java program to replace the second element of a ArrayList with the specified element.");
        int index = 0;
        System.out.println("Origin list " + list);
        list.set(2, list.get(index));
        System.out.println("Replaced 2nd element from index " + index + " : " + list + "\n");
    }

    public void exercise22() {
        System.out.println("Exercise 22. Write a Java program to print all the elements of a ArrayList using the position of the elements.");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        System.out.println();
    }
}
