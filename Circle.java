/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.Scanner;
import java.awt.*;
import java.awt.geom.*;

public class Circle extends Shape {
    private float radius;
    final float pi = (float) Math.PI;
    
    public Circle() {
    }
    
    public Circle(float r) {
        radius = r;
    }
    
    // To read the shape information from users
    public void readShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the radius: ");
        this.radius = input.nextFloat();
    }
    
    // To compute the shape’s area
    public void computeArea() {
        super.area = pi * radius * radius;
    }
    
    // To compute the shape’s perimeter
    public void computePerimeter() {
        super.perimeter = 2 * pi * radius;
    }
    
    // To display the area and perimeter of the shape
    public void displayShape() {
        System.out.println("Area of circle = " + super.area);
        System.out.println("Perimeter of circle = " + super.perimeter);
    }
    
    // To draw the circle
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        // (this, "color", x pos, y pos, diameter, diameter)
        canvas.draw(this, "blue", new Ellipse2D.Float(10, 10, radius * 2 , radius * 2));
    }
}