package homework4.task1.spaceShapes;

import homework4.task1.SpaceShape;
import homework4.task1.vertices.Vertice3D;

public class Sphere extends SpaceShape {
    private Vertice3D vertice;
    private double radius;

    public Sphere(Vertice3D vertice, double radius){
        this.vertice = vertice;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public String toString() {
        String result = "Figure type: " + getClass().getSimpleName() + "\n" +
                String.format("Volume: %.2f\nArea: %.2f\n", getVolume(), getArea()) +
                "Vertice: " + vertice.getX() + ", " + vertice.getY() + ", " + vertice.getZ();
        return result;
    }
}
