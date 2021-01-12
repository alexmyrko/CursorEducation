package homework4.task1.spaceShapes;

import homework4.task1.SpaceShape;
import homework4.task1.vertices.Vertice3D;

public class Cuboid extends SpaceShape {
    private final Vertice3D vertice;
    private final double width;
    private final double height;
    private final double depth;

    public Cuboid(Vertice3D vertice, double width, double height, double depth){
        this.vertice = vertice;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return width * height * depth;
    }

    @Override
    public double getVolume() {
        return 2 * (width * height + height * depth + depth * width);
    }

    @Override
    public String toString() {
        String result = "Figure type: " + getClass().getSimpleName() + "\n" +
                String.format("Volume: %.2f\nArea: %.2f\n", getVolume(), getArea()) +
                "Vertice: " + vertice.getX() + ", " + vertice.getY() + ", " + vertice.getZ();
        return result;
    }
}
