package homework4.task1.spaceShapes;

import homework4.task1.SpaceShape;
import homework4.task1.vertices.Vertice3D;

public class SquarePiramyd extends SpaceShape {

    private final Vertice3D vertice;
    private final double baseWidth;
    private final double height;

    public SquarePiramyd(Vertice3D vertice, double baseWidth, double height){
        this.vertice = vertice;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double getArea() {
        return baseWidth * (baseWidth + Math.sqrt(Math.pow(baseWidth, 2) + 4 * Math.pow(height, 2)));
    }

    @Override
    public double getVolume() {
        return baseWidth * baseWidth * height / 3;
    }

    @Override
    public String toString() {
        String result = "Figure type: " + getClass().getSimpleName() + "\n" +
                String.format("Volume: %.2f\nArea: %.2f\n", getVolume(), getArea()) +
                "Vertice: " + vertice.getX() + ", " + vertice.getY() + ", " + vertice.getZ();
        return result;
    }
}
