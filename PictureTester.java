/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

public class PictureTester {
    public static void main(String[] args) {
        Picture p = new Picture();
        p.addShape(new Square(20));
        p.addShape(new Square(20));
        p.addShape(new Circle(30));
        p.addShape(new Circle(40));
        p.addShape(new Rectangle(50,60));
        p.addShape(new Rectangle(70,80));
        p.computeShape();
        p.listAllShapeTypes();
        p.listSingleShapeType("Circle");
    }
}