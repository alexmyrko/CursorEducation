package homework3;

public class Main {
    public static void main(String[] args) {

// Task1
        double radius = 4.38;
        Circle circle = new Circle(radius);
        double area = circle.getAreaValue(radius);
        System.out.println(String.format("Circle area with radius %.2f is: %.2f", radius, area));
        System.out.println();

// Task 2
        Car car = new Car("Renault");
        car.start();
        car.move(3);
        car.keepSpeed(100);
        car.stop();
        System.out.println();

// Task 3
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();
        System.out.println("Number of created objects for class " + MyClass.class.getSimpleName() + ": " + MyClass.getCount());
        System.out.println();

// Task 4
// Додавання і віднімання реалізовані одним методом додавання, оскільки все зводиться до знаку перед числами при додаванні ри операції додавання
        Fractions fr1 = new Fractions(124.029);
        Fractions fr2 = new Fractions(-765.08);
        Fractions fr3 = new Fractions(5.09);
        Fractions fr4 = new Fractions(7.09);
        fr1.sum(fr2);
        fr3.multiply(fr4);
        System.out.println();

// Task 5
        Money amount1 = new Money(125, (byte) 40);
        Money amount2 = new Money(50, (byte) 70);
        amount1.sum(amount2);
        amount1.substract(amount2);
        amount1.multiply(amount2);
        amount1.divide(amount2);
    }
}
