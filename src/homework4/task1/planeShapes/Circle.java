package homework4.task1.planeShapes;

import homework4.task1.PlaneShape;
import homework4.task1.vertices.Vertice2D;

public class Circle extends PlaneShape {
    private Vertice2D vertice;
    private double radius;

    public Circle(Vertice2D vertice, double radius){
        this.vertice = vertice;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        String result = "Figure type: " + getClass().getSimpleName() + "\n" +
                String.format("Perimeter: %.2f\nArea: %.2f\n", getPerimeter(), getArea()) +
                "Vertice: " + vertice.getX() + ", " + vertice.getY();
        return result;
    }
}
