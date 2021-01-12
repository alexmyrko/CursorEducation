package homework5;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(5);
        myList.add(4.95);
        myList.add(-45);
        myList.add(67.2);
        myList.showSmallestAndLargest();


        ComparableList integers = new ComparableList();
        integers.add(3);

        ComparableList strings = new ComparableList();
        strings.add("piece of text");

        Integer[] integerArray = new Integer[]{5, -7, 12, 3};
        String[] stringArray = new String[]{"Potato", "Apple", "Grapefruit", "Cherry"};

        ComparableArray array1 = new ComparableArray(integerArray);
        ComparableArray array2 = new ComparableArray(stringArray);
        array1.showSmallestAndLargest();
        array2.showSmallestAndLargest();

    }

}
