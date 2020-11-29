package homework1;

import static java.lang.String.format;

public class task1 {
    public static void main(String[] args) {
        byte b1 = 40;
        byte b2 = 7;

        short sh1 = 30;
        short sh2 = 4;

        long l1 = 75L;
        long l2 = 10L;

        double d1 = 3456.897;
        double d2 = 563.79;

        float f1 = 100f;
        float f2 = 8f;

        System.out.println(format("byte values %d and %d: ", b1, b2));
        System.out.println("byte values adding: " + (b1 + b2));
        System.out.println("byte values subtracting: " + (b1 - b2));
        System.out.println("byte values dividing: " + b1 / b2);
        System.out.println("byte values multiplying: " + b1 * b2);
        System.out.println();

        System.out.println(format("short values  %d and %d: ", sh1, sh2));
        System.out.println("short values adding: " + (sh1 + sh2));
        System.out.println("short values subtracting: " + (sh1 - sh2));
        System.out.println("short values dividing: " + sh1 / sh2);
        System.out.println("short values multiplying: " + sh1 * sh2);
        System.out.println();

        System.out.println(format("long values  %d and %d: ", l1, l2));
        System.out.println("long values adding: " + (l1 + l2));
        System.out.println("long values subtracting: " + (l1 - l2));
        System.out.println("long values dividing: " + l1 / l2);
        System.out.println("long values multiplying: " + l1 * l2);
        System.out.println();

        System.out.println(format("double values %f and %f: ", d1, d2));
        System.out.println("double values adding: " + (d1 + d2));
        System.out.println("double values subtracting: " + (d1 - d2));
        System.out.println("double values dividing: " + d1 / d2);
        System.out.println("double values multiplying: " + d1 * d2);
        System.out.println();

        System.out.println(format("float values %f and %f: ", f1, f2));
        System.out.println("float values adding: " + (f1 + f2));
        System.out.println("float values subtracting: " + (f1 - f2));
        System.out.println("float values dividing: " + f1 / f2);
        System.out.println("float values multiplying: " + f1 * f2);
        System.out.println();
    }
}
