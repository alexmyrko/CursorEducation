package homework3;

public class MyClass {
    private static int count = 0;
    public MyClass(){
        count ++;
    }
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();
        System.out.println("Number of created objects for class " + MyClass.class.getSimpleName() + ": " + count);
    }

    public static int getCount() {
        return count;
    }
}
