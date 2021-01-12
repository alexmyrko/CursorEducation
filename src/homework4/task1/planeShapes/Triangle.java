package homework4.task1.planeShapes;

import homework4.task1.PlaneShape;
import homework4.task1.vertices.Vertice2D;

public class Triangle extends PlaneShape {
    private final Vertice2D vertice1;
    private final Vertice2D vertice2;
    private final Vertice2D vertice3;

    public Triangle(Vertice2D vertice1, Vertice2D vertice2, Vertice2D vertice3){
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double line1 = Math.sqrt(Math.pow((vertice1.getX() - vertice2.getX()), 2) + Math.pow((vertice1.getY() - vertice2.getY()),2));
        double line2 = Math.sqrt(Math.pow((vertice2.getX() - vertice3.getX()), 2) + Math.pow((vertice2.getY() - vertice3.getY()),2));
        double line3 = Math.sqrt(Math.pow((vertice3.getX() - vertice1.getX()), 2) + Math.pow((vertice3.getY() - vertice1.getY()),2));
        return Math.sqrt(halfPerimeter * (halfPerimeter - line1) * (halfPerimeter - line2) * (halfPerimeter - line3));
    }

    @Override
    public double getPerimeter() {
        double line1 = Math.sqrt(Math.pow((vertice1.getX() - vertice2.getX()), 2) + Math.pow((vertice1.getY() - vertice2.getY()),2));
        double line2 = Math.sqrt(Math.pow((vertice2.getX() - vertice3.getX()), 2) + Math.pow((vertice2.getY() - vertice3.getY()),2));
        double line3 = Math.sqrt(Math.pow((vertice3.getX() - vertice1.getX()), 2) + Math.pow((vertice3.getY() - vertice1.getY()),2));
        return line1 + line2 + line3;
    }

    @Override
    public String toString() {
        String result = "Figure type: " + getClass().getSimpleName() + "\n" +
                String.format("Perimeter: %.2f\nArea: %.2f\n", getPerimeter(), getArea()) +
                        "Vertices: " + vertice1.getX() + ", " + vertice1.getY() + "\t" +
                                vertice2.getX() + ", " + vertice2.getY() + "\t" +
                                vertice3.getX() + ", " + vertice3.getY();
        return result;
    }
}
