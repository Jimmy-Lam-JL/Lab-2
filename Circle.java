/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.Scanner;

import java.awt.*;
import java.awt.geom.*;

public class Circle extends Shape {
    private float radius;
    
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
        super.area = (float)(3.14 * radius * radius); // 3.14 to be replaced by PI later
    }
    
    // To compute the shape’s perimeter
    public void computePerimeter() {
        super.perimeter = (float)(2 * 3.14 * radius);
    }
    
    // To display the area and perimeter of the shape
    public void displayShape() {
        System.out.println("Area of circle = " + super.area);
        System.out.println("Perimeter of circle = " + super.perimeter);
    }
    
    // To draw the circle
    public void draw() {
        /*
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Ellupse2D.Float(x position, y position, diameter, diameter)); 

        // remember to use the AWT's eclipse/circle to draw the circle on Canvas.
        */
    }
}