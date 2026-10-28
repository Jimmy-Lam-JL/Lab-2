/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.Scanner;
import java.awt.*;

public class Square extends Shape {
    private float length;
    
    public Square() {
    }
    
    public Square(float l) {
        length = l;
    }
    
    // To read the shape information from users
    public void readShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length:");
        length = input.nextFloat();
    }
    
    // To compute the shape’s area
    public void computeArea() {
        super.area = length * length;
    }
    
    // To compute the shape’s perimeter
    public void computePerimeter() {
        super.perimeter = length * 4;
    }
    
    // To display the area and perimeter of the shape
    public void displayShape() {
        System.out.println("Area of square = " + super.area);
        System.out.println("Perimeter of square = " + super.perimeter);
    }
    
    // To draw the square
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        // (this, "color", x pos, y pos, size, size)
        canvas.draw(this, "blue", new java.awt.Rectangle(100, 100, (int)length, (int)length));
    }
}