/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.Scanner;
import java.awt.*;

public class Rectangle extends Shape {
    private float length;
    private float width;
    
    public Rectangle() {
    }
    
    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }
    
    // To read the shape information from users
    public void readShape() {
        System.out.println("Please input the length:");
        Scanner input = new Scanner(System.in);
        length = input.nextFloat();
        System.out.println("Please input the width:");
        width = input.nextFloat();
    }
    
    // To compute the shape’s area
    public void computeArea() {
        super.area = length * width;
    }
    
    // To compute the shape’s perimeter
    public void computePerimeter() {
        super.perimeter = 2 * (length + width);
    }
    
    // To display the area and perimeter of the shape
    public void displayShape() {
        System.out.println("Area of rectangle = " + super.area);
        System.out.println("Perimeter of rectangle = " + super.perimeter);
    }
    
    // To draw the rectangle
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        // (this, "color", x pos, y pos, size, size)
        canvas.draw(this, "blue", new java.awt.Rectangle(200, 200, (int)(length), (int)(width)));
    }
}