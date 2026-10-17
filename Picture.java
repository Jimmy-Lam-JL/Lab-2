/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.ArrayList;

public class Picture {
    private ArrayList<Shape> shapes;
    
    public void addShape(Shape s) {
        shapes.add(s);
    }
    
    public void computeShape() {
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle)shape).computeArea();
                ((Circle)shape).computePerimeter();
            } else if (shape instanceof Square) {
                ((Square)shape).computeArea();
                ((Square)shape).computePerimeter();
            } else if (shape instanceof Rectangle) {
                ((Rectangle)shape).computeArea();
                ((Rectangle)shape).computePerimeter();
            }
        }
    }
    
    public void listAllShapeTypes() {
        for (Shape shape : shapes) {
            if (shape instanceof Circle)
                ((Circle)shape).displayShape();
            else if (shape instanceof Square)
                ((Square)shape).displayShape();
            else if (shape instanceof Rectangle)
                ((Rectangle)shape).displayShape();
        }
    }
    
    public void listSingleShapeType(String className) {
        for (Shape shape : shapes) {
            if (shape instanceof Circle && className == "Circle")
                ((Circle)shape).displayShape();
            else if (shape instanceof Square && className == "Square")
                ((Square)shape).displayShape();
            else if (shape instanceof Rectangle && className == "Rectangle")
                ((Rectangle)shape).displayShape();
        }
    }
}