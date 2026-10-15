
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape
{
    // instance variables - replace the example below with your own
    private double area;
    private double perimeter;

    /**
     * Constructor for objects of class Shape
     */
    public Shape(double Area, double Perimeter)
    {
        // initialise instance variables
        this.area = Area;
        this.perimeter = Perimeter;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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