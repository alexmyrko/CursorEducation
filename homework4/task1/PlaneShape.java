package homework4.task1;

import homework4.task1.interfaces.AreaMeasurable;
import homework4.task1.interfaces.PerimeterMeasurable;
import homework4.task1.vertices.Vertice2D;
import homework4.task1.vertices.Vertice3D;

import java.util.ArrayList;
import java.util.List;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {
    private static List<Vertice2D> vertices2D;

    // set list of vertices with {x,y} coordinates
    public static void set2DVertices(List<Vertice3D> vertices){
        vertices2D = new ArrayList<>();
        for (Vertice3D vertice : vertices) {
            vertices2D.add(new Vertice2D(vertice.getX(), vertice.getY()));
        }
    }

    //  get vertices with {x,y} coordinates
    public static List<Vertice2D> get2DVertices(){
        return vertices2D;
    }
}
