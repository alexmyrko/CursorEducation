1) Write a generic class named MyList, with a type parameter T. The type parameter T should be constrained to
an upper bound: the Number class. The class should have as a field an ArrayList of T. Write a public method
named add, which accepts a parameter of type T. When an argument is passed to the method, it is added to the
ArrayList. Write two other methods, largest and smallest, which return the largest and smallest values in the
ArrayList.

2) Modify the MyList class that you wrote for Programming challenge 1(above) so the type parameter T should
accept any type that implements the Comparable interface. Test the class in a program that creates one
instance of MyList to store Integers, and another instance to store Strings.

3) Highest and Lowest Elements
Write a generic class with a type parameter constrained to any type that implements Comparable. The
constructor should accept an array of such objects. The class should have methods that return the highest and
lowest values in the array. Demonstrate the class in an application.