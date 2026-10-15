/**
 * LAM King Shan (24131593D)
 * LAU Ching Hoi (24133078D)
 */

import java.util.Scanner;

public class ShapeTester {
    public static void main() {
        for (int i = 0; i < 41; i++)
            System.out.print("*");
        System.out.println("");
        System.out.println("* Please choose one of the followings:  *");
        System.out.println("* Press 'c' - Circle\t\t\t*");
        System.out.println("* Press 's' - Square\t\t\t*");
        System.out.println("* Press 'r' - Rectangle\t\t\t*");
        System.out.println("* Press 'x' - EXIT\t\t\t*");
        for (int i = 0; i < 41; i++)
            System.out.print("*");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        
        switch (option) {
            case "c":
                Circle.readShape();
                break;
            case "s":
                Square.readShape();
                break;
            case "r":
                Rectangle.readShape();
                break;
            case "x":
                break;
            default:
                System.out.println("Invalid command!");
        }
    }
}