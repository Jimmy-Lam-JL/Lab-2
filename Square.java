/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.Scanner;

import java.awt.*;
import java.awt.geom.*;

public class Square extends Shape {
    private float length;
    
    public Square() {
    }
    
    public Square(float l) {
        length = l;
    }
    
    // To read the shape information from users
    public void readShape() {
        System.out.println("Please input the length:");
        Scanner input = new Scanner(System.in);
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
        /*
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, [color], new Ellupse2D.Float(x position, y position, size, size)); 
        */
    }
    }