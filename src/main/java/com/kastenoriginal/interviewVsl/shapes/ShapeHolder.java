package src.main.java.com.kastenoriginal.interviewVsl.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeHolder {

    private static List<Shape> shapeList = new ArrayList<>();
    private static List<String> allNames = new ArrayList<>();

    private ShapeHolder() {
    }

    public static List<Shape> getAllShapes() {
        if (shapeList.isEmpty()) {
            shapeList.add(new Rectangle());
            shapeList.add(new Circle());
            shapeList.add(new Triangle());
            shapeList.add(new Sphere());
        }

        return shapeList;
    }

    public static List<String> getAllShapeNames() {
        if (allNames.isEmpty()) {
            for (Shape shape : getAllShapes()) {
                allNames.add(shape.getShapeName());
            }
        }

        return allNames;
    }
}
