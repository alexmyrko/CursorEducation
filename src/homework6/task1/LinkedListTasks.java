package homework6.task1;

import java.util.*;

public class LinkedListTasks {
    static LinkedList<String> list = new LinkedList<>();

    {
        list.add("Car");
        list.add("Train");
        list.add("Bus");
    }

    public void exercise1() {
        System.out.println("1. Write a Java program to append the specified element to the end of a linked list.");
        list.addLast("Boat");
        System.out.println("Element added to the end of LinkedList: " + list + "\n");
    }

    public void exercise2() {
        System.out.println("2. Write a Java program to iterate through all elements in a linked list.");
        for (String element : list)
            System.out.println(element);
        System.out.println();
    }

    public void exercise3() {
        System.out.println("3. Write a Java program to iterate through all elements in a linked list starting at the specified position.");
        int position = 2;
        for (int i = position; i < list.size(); i++)
            System.out.println(list.get(i));
        System.out.println();
    }

    public void exercise4() {
        System.out.println("4. Write a Java program to iterate a linked list in reverse order.");
        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();
    }

    public void exercise5() {
        System.out.println("5. Write a Java program to insert the specified element at the specified position in the linked list.");
        int index = 1;
        String insertion = "Tram";
        list.add(index, insertion);
        System.out.println("Insertion " + insertion + " into position " + index + " : " + list + "\n");
    }

    public void exercise6() {
        System.out.println("6 .Write a Java program to insert elements into the linked list at the first and last position.");
        String insertion = "Trolleybus";
        list.addFirst(insertion);
        list.addLast(insertion);
        System.out.println("Insert " + insertion + " to first position in LinkedList: " + list + "\n");
    }

    public void exercise7() {
        System.out.println("7. Write a Java program to insert the specified element at the front of a linked list.");
        String insertion = "Bicycle";
        list.offerFirst(insertion);
        System.out.println("Insert " + insertion + " to front of LinkedList: " + list + "\n");
    }

    public void exercise8() {
        System.out.println("8. Write a Java program to insert the specified element at the end of a linked list.");
        String insertion = "Scooter";
        list.offerLast(insertion);
        System.out.println("Insert " + insertion + " to front of LinkedList: " + list + "\n");
    }

    public void exercise9() {
        System.out.println("9. Write a Java program to insert some elements at the specified position into a linked list.");
        LinkedList<String> insertionList = new LinkedList<>();
        insertionList.add("Motorcycle");
        insertionList.add("Monowheel");
        int position = 2;
        list.addAll(position, insertionList);
        System.out.println("Insert " + insertionList + " from position " + position + ". Result: " + list + "\n");
    }

    public void exercise10() {
        System.out.println("10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.");
        String element = "Trolleybus";
        int first = list.indexOf(element);
        int last = list.lastIndexOf(element);
        System.out.println("First occurence of " + element + " at index " + first + " and last occurence at index " + last + " in list: " + list + "\n");
    }

    public void exercise11() {
        System.out.println("11. Write a Java program to display the elements and their positions in a linked list.");
        for (int i = 0; i < list.size(); i++){
            System.out.println("Position: " + i + ",  element: " + list.get(i));
        }
        System.out.println();
    }

    public void exercise12() {
        System.out.println("12. Write a Java program to remove a specified element from a linked list.");
        int position = 1;
        list.remove(position);
        System.out.println("List after removing element from position " + position + ": " + list + "\n");
    }

    public void exercise13() {
        System.out.println("13. Write a Java program to remove first and last element from a linked list.");
        String first = list.removeFirst();
        String last = list.removeLast();
        System.out.println("Removed first " + first + " and last " + last + " elements. Resulting list: " + list + "\n");
    }

    public void exercise14() {
        System.out.println("14. Write a Java program to remove all the elements from a linked list.");
        LinkedList<String> copiedList = new LinkedList<>(list);
        System.out.println("Origin list: " + copiedList);
        copiedList.clear();
        System.out.println("Cleared list: " + copiedList);
    }

    public void exercise15() {
        System.out.println("15. Write a Java program of swap two elements in an linked list.");
        int position1 = 2;
        int position2 = 5;
        System.out.println("List before swap: " + list);
        Collections.swap(list, position1, position2);
        System.out.println("List after swap " + position1 + " and " + position2 + " elements: " + list + "\n");
    }

    public void exercise16() {
        System.out.println("16. Write a Java program to shuffle the elements in a linked list.");
        System.out.println("Origin lsit: " + list);
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list + "\n");
    }

    public void exercise17() {
        System.out.println("17. Write a Java program to join two linked lists.");
        LinkedList<String> newList = new LinkedList<>();
        newList.add("Tram");
        newList.add("Bicycle");
        System.out.println("Origin list: " + list);
        list.addAll(newList);
        System.out.println("After joining " + newList + ": " + list + "]\n");
    }

    public void exercise18() {
        System.out.println("18. Write a Java program to clone an linked list to another linked list.");
        LinkedList<String> newList = (LinkedList<String>) list.clone();
        System.out.println("Origin list: " + list);
        System.out.println("Cloned list: " + newList + "\n");
    }

    public void exercise19() {
        System.out.println("19. Write a Java program to remove and return the first element of a linked list.");
        System.out.println("Origin list: " + list);
        String removed = list.poll();
        System.out.println("After removing first element: " + list + ".\nRemoved element is: " + removed + "\n");
    }

    public void exercise20() {
        System.out.println("20. Write a Java program to retrieve but does not remove, the first element of a linked list.");
        System.out.println("List: " + list + ".\nRetrieved, but not removed first element: " + list.peek() + "\n");
    }

    public void exercise21() {
        System.out.println("21. Write a Java program to retrieve but does not remove, the last element of a linked list.");
        System.out.println("List: " + list + ".\nRetrieved, but not removed last element: " + list.peekLast() + "\n");
    }

    public void exercise22() {
        System.out.println("22. Write a Java program to check if a particular element exists in a linked list.");
        String elemenet = "Bus";
        System.out.println("Is element " + elemenet + " in the list " + list + "?\nAnswer: " + list.contains(elemenet) + "\n");
    }

    public void exercise23() {
        System.out.println("23. Write a Java program to convert a linked list to array list.");
        ArrayList<String> newList = new ArrayList<>(list);
        System.out.println("Origin LinkedList: " + list);
        System.out.println("Created ArrayList: " + newList + "\n");
    }

    public void exercise24() {
        System.out.println("24. Write a Java program to compare two linked lists.");
        LinkedList<String> list2 = new LinkedList<>(list);
        boolean isTheSame = true;
        if (list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++)
                if (!list.get(i).equals(list2.get(i)))
                    isTheSame = false;
        } else isTheSame = false;
        System.out.println("Are list " + list + "\nand\n" + list2 + " identical? \nAnswer: " + isTheSame + "\n");
    }

    public void exercise25() {
        System.out.println("25. Write a Java program to test an linked list is empty or not.");
        System.out.println("Origin list " + list + " is empty?  : " + list.isEmpty());
        LinkedList<String> newList = new LinkedList<>(list);
        newList.clear();
        System.out.println("Another list " + newList + " is empty?  : " + newList.isEmpty() + "\n");
    }

    public void exercise26() {
        System.out.println("26. Write a Java program to replace an element in a linked list.");
        System.out.println("Origin list: " + list);
        int index = 3;
        String element = "Rocket";
        list.set(index, element);
        System.out.println("List after replacing element " + element + " at index " + index + " :" + list + "\n");
    }
}
