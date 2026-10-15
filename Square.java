/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.Scanner;

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
        
    }
    
    // To compute the shape’s perimeter
    public void computePerimeter() {
        
    }
    
    // To display the area and perimeter of the shape
    public void displayShape() {
        
    }
}