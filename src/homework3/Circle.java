package homework3;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getAreaValue(double radius){
        return radius * radius * Math.PI;
    }
}
