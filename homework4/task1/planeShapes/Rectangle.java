package homework4.task1.planeShapes;

import homework4.task1.PlaneShape;
import homework4.task1.vertices.Vertice2D;

public class Rectangle extends PlaneShape {
    private Vertice2D vertice;
    private double width;
    private double height;

    public Rectangle(Vertice2D vertice, double width, double height){
        this.vertice = vertice;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public String toString() {
        String result = "Figure type: " + getClass().getSimpleName() + "\n" +
                String.format("Perimeter: %.2f\nArea: %.2f\n", getPerimeter(), getArea()) +
                "Vertice: " + vertice.getX() + ", " + vertice.getY();
        return result;
    }
}
