package homework4.task1;

import homework4.task1.planeShapes.Circle;
import homework4.task1.planeShapes.Rectangle;
import homework4.task1.planeShapes.Triangle;
import homework4.task1.spaceShapes.Cuboid;
import homework4.task1.spaceShapes.Sphere;
import homework4.task1.spaceShapes.SquarePiramyd;
import homework4.task1.vertices.Vertice2D;
import homework4.task1.vertices.Vertice3D;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Shape> shapes = new ArrayList<>();

    static {
        List<Vertice3D>vertices3D = new ArrayList<>();
        vertices3D.add(new Vertice3D(-4, 12, 2));
        vertices3D.add(new Vertice3D(15, 4, 10));
        vertices3D.add(new Vertice3D(8, 20, -3));
        vertices3D.add(new Vertice3D(34, 7, -15));
        vertices3D.add(new Vertice3D(10, 30, 20));
        vertices3D.add(new Vertice3D(0, -15, 7));
        vertices3D.add(new Vertice3D(-17, 10, 24));
        vertices3D.add(new Vertice3D(-10, 20, 4));
        Shape.vertices3D.addAll(vertices3D);
    }

    public static void main(String[] args) {
        // initializing lists of 3D vertices and 2D vertices based on 3D vertices
        List<Vertice3D> vertices3D = Shape.vertices3D;
        PlaneShape.set2DVertices(vertices3D);
        List<Vertice2D> vertices2D = PlaneShape.get2DVertices();

        //  Creating Plane Shape objects and adding to list with Shapes
        int i = 0;
        PlaneShape triangle = new Triangle(vertices2D.get(i++), vertices2D.get(i++), vertices2D.get(i++));
        PlaneShape rectangle = new Rectangle(vertices2D.get(i++), 10, 5);
        PlaneShape circle = new Circle(vertices2D.get(i++), 10);
        shapes.add(triangle);
        shapes.add(rectangle);
        shapes.add(circle);

        //  Creating Space Shape objects and adding to list with Shapes
        SpaceShape squarePiramyd = new SquarePiramyd(vertices3D.get(i++), 10, 5);
        SpaceShape sphere = new Sphere(vertices3D.get(i++), 10);
        SpaceShape cuboid = new Cuboid(vertices3D.get(i++), 8, 12, 5);
        shapes.add(squarePiramyd);
        shapes.add(sphere);
        shapes.add(cuboid);

        //  Print all Shape objects to console
        for (Shape shape : shapes)
            System.out.println(shape.toString() + "\n");
    }
}
