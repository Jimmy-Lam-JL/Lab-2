/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;

        do {
            for (int i = 0; i < 41; i++)
                System.out.print("*");
            System.out.println("");
            System.out.println("* Please choose one of the followings:  *");
            System.out.println("* Press 'c' - Circle                    *");
            System.out.println("* Press 's' - Square                    *");
            System.out.println("* Press 'r' - Rectangle                 *");
            System.out.println("* Press 'x' - EXIT                      *");
            for (int i = 0; i < 41; i++)
                System.out.print("*");
            System.out.println("");
            
            option = input.nextLine();
            
            switch (option) {
                case "c":
                    Circle c = new Circle();
                    c.readShape();
                    c.computeArea();
                    c.computePerimeter();
                    c.displayShape();
                    c.draw();
                    break;
                    
                case "s":
                    Square s = new Square();
                    s.readShape();
                    s.computeArea();
                    s.computePerimeter();
                    s.displayShape();
                    s.draw();
                    break;
                    
                case "r":
                    Rectangle r = new Rectangle();
                    r.readShape();
                    r.computeArea();
                    r.computePerimeter();
                    r.displayShape();
                    r.draw();
                    break;
                    
                case "x":
                    break;
                    
                default:
                    System.out.println("Invalid command!");
            }
            System.out.println();
        } while (option == "x");
        input.close();
    }
}