package homework6.task1;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetTasks {
    static TreeSet<String> set = new TreeSet<>();
    static TreeSet<Integer> numberSet = new TreeSet<>();
    {
        numberSet.add(5);
        numberSet.add(-3);
        numberSet.add(12);
        numberSet.add(7);
        numberSet.add(0);
    }

    public void exercise1() {
        System.out.println("1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.");
        set.add("White");
        set.add("Gray");
        set.add("Yellow");
        set.add("Blue");
        set.add("Green");
        System.out.println("Created treeset: " + set + "\n");
    }

    public void exercise2() {
        System.out.println("2. Write a Java program to iterate through all elements in a tree set.");
        for (String element : set)
            System.out.println(element);
        System.out.println();
    }

    public void exercise3() {
        System.out.println("3. Write a Java program to add all the elements of a specified tree set to another tree set.");
        TreeSet<String> newSet = new TreeSet<>();
        newSet.addAll(set);
        System.out.println("New treeset with all added elements from origin set: " + newSet + "\n");
    }

    public void exercise4() {
        System.out.println("4. Write a Java program to create a reverse order view of the elements contained in a given tree set.");
        System.out.println("Origin treeset: " + set);
        System.out.println("Treeset in reverse order: " + set.descendingSet() + "\n");
    }

    public void exercise5() {
        System.out.println("5. Write a Java program to get the first and last elements in a tree set.");
        System.out.println("Origin treeset: " + set);
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last() + "\n");
    }

    public void exercise6() {
        System.out.println("6. Write a Java program to clone a tree set list to another tree set.");
        System.out.println("Origin treeset: " + set);
        TreeSet<String> newSet = (TreeSet<String>) set.clone();
        System.out.println("Cloned treeset: " + newSet + "\n");
    }

    public void exercise7() {
        System.out.println("7. Write a Java program to get the number of elements in a tree set. ");
        System.out.println("Number of elements in treeset is: " + set.size() + "\n");
    }

    public void exercise8() {
        System.out.println("8. Write a Java program to compare two tree sets.");
        TreeSet<String> newSet = new TreeSet<>(set);
        newSet.remove("Gray");
        for(String element : set)
            System.out.println("Another set contains element " + element + "? : " + newSet.contains(element));
        System.out.println();
    }

    public void exercise9() {
        System.out.println("9. Write a Java program to find the numbers less than 7 in a tree set.");
        System.out.println("Origin treeset: " + numberSet);
        System.out.println("TreeSet with numbers less than 7: " + numberSet.headSet(7) + "\n");
    }

    public void exercise10() {
        System.out.println("10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.");
        System.out.println("Origin treeset: " + numberSet);
        Integer element = 2;
        System.out.println("Closest element which is greater than or equal to " + element + ": " + numberSet.ceiling(element) + "\n");
    }

    public void exercise11() {
        System.out.println("11. Write a Java program to get the element in a tree set which is less than or equal to the given element.");
        System.out.println("Origin treeset: " + numberSet);
        Integer element = 2;
        System.out.println("Closest element which is less than or equal to " + element + ": " + numberSet.floor(element) + "\n");
    }

    public void exercise12() {
        System.out.println("12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.");
        System.out.println("Origin treeset: " + numberSet);
        Integer element = 2;
        System.out.println("Element which is strictly greater than or equal to " + element + ": " + numberSet.higher(element) + "\n");
    }

    public void exercise13() {
        System.out.println("13. Write a Java program to get an element in a tree set which is strictly less than the given element.");
        System.out.println("Origin treeset: " + numberSet);
        Integer element = 2;
        System.out.println("Element which is strictly less than " + element + ": " + numberSet.lower(element) + "\n");
    }

    public void exercise14() {
        System.out.println("14. Write a Java program to retrieve and remove the first element of a tree set.");
        System.out.println("Origin treeset: " + set);
        String first = set.pollFirst();
        System.out.println("Retrieved first element: " + first);
        System.out.println("Modified treeset: " + set + "\n");
    }

    public void exercise15() {
        System.out.println("15. Write a Java program to retrieve and remove the last element of a tree set.");
        System.out.println("Origin treeset: " + set);
        String last = set.pollLast();
        System.out.println("Retrieved last element: " + last);
        System.out.println("Modified treeset: " + set + "\n");
    }

    public void exercise16() {
        System.out.println("16. Write a Java program to remove a given element from a tree set.");
        System.out.println("Origin treeset: " + set);
        String element = "White";
        set.remove(element);
        System.out.println("Treeset after removing " + element + " element: " + set + "\n");
    }
}
