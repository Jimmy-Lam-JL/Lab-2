/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

public abstract class Shape implements Drawable {
    protected double area;
    protected double perimeter;
    
    /**
     * Abstract methods for objects of class Shape
     */
    // To read the shape information from users
    abstract public void readShape();
    
    // To compute the shape’s area
    abstract public void computeArea();
    
    // To compute the shape’s perimeter
    abstract public void computePerimeter();
    
    // To display the area and perimeter of the shape
    abstract public void displayShape();
}