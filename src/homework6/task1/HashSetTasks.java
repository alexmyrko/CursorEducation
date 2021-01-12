package homework6.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTasks {
    static HashSet<String> set = new HashSet<>();
    {
        set.add("Water");
        set.add("Milk");
        set.add("Tea");
        set.add("Coffee");
    }

    public void exercise1() {
        System.out.println("1. Write a Java program to append the specified element to the end of a hash set.");
        System.out.println("Origin set: " + set);
        String element = "Beer";
        set.add(element);
        System.out.println("Set after append " + element + " element to the end of set: " + set + "\n");
    }

    public void exercise2() {
        System.out.println("2. Write a Java program to iterate through all elements in a hash list.");
        for (String element : set)
            System.out.println(element);
        System.out.println();
    }

    public void exercise3() {
        System.out.println("3. Write a Java program to get the number of elements in a hash set.");
        System.out.println("Number of elements in HashSet " + set + " is: " + set.size() + "\n");
    }

    public void exercise4() {
        System.out.println("4. Write a Java program to empty an hash set.");
        HashSet<String> newSet = new HashSet<>(set);
        System.out.println("Origin hashset: " + newSet);
        newSet.clear();
        System.out.println("Cleared hashset: " + newSet + "\n");
    }

    public void exercise5() {
        System.out.println("5. Write a Java program to test a hash set is empty or not.");
        System.out.println("Origin hashset " + set + " is empty? : " + set.isEmpty() + "\n");
    }

    public void exercise6() {
        System.out.println("6. Write a Java program to clone a hash set to another hash set.");
        System.out.println("Origin hashset: " + set);
        HashSet<String> newSet = (HashSet<String>) set.clone();
        System.out.println("Cloned hashset: " + newSet + "\n");
    }

    public void exercise7() {
        System.out.println("7. Write a Java program to convert a hash set to an array.");
        System.out.println("Hashset: " + set);
        String[] array = new String[set.size()];
        set.toArray(array);
        System.out.println("Array retrieved from hashset: " + Arrays.toString(array) + "\n");
    }

    public void exercise8() {
        System.out.println("8. Write a Java program to convert a hash set to a tree set.");
        System.out.println("Origin hashset: " + set);
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Retrieved treeset: " + treeSet + "\n");
    }

    public void exercise9() {
        System.out.println("9. Write a Java program to convert a hash set to a List/ArrayList.");
        System.out.println("Origin hashset: " + set);
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println("List retrieved from hashset: " + list + "\n");
    }

    public void exercise10() {
        System.out.println("10. Write a Java program to compare two hash set.");
        System.out.println("Origin hashset: " + set);
        HashSet<String> newSet = new HashSet<>(set);
        newSet.remove("Milk");
        for(String element : set)
            System.out.println("Another set contains element " + element + "? : " + newSet.contains(element));
        System.out.println();
    }

    public void exercise11() {
        System.out.println("11. Write a Java program to compare two sets and retain elements which are same on both sets.");
        System.out.println("10. Write a Java program to compare two hash set.");
        System.out.println("Origin hashset: " + set);
        HashSet<String> newSet = new HashSet<>(set);
        newSet.remove("Milk");
        newSet.remove("Tea");
        set.retainAll(newSet);
        System.out.println("Retained set: " + set + "\n");
    }

    public void exercise12() {
        System.out.println("12. Write a Java program to remove all of the elements from a hash set.");
        System.out.println("Origin set: " + set);
        set.clear();
        System.out.println("Set with all removed elements: " + set + "\n");
    }
}
