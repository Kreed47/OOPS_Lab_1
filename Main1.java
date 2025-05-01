

import java.util.Scanner;

public class Main1 {

    public static double area(double length, double breadth) {
        return length * breadth;
    }


    public static double area(double side) {
        return side * side;
    }


    public static double areaCircle(double radius) {
        return 3.14 * radius * radius;
    }


    public static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");

        System.out.print("Enter your choice (1-4): ");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the rectangle: ");
                double length = s.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = s.nextDouble();
                System.out.println("Area of Rectangle: " + area(length, breadth));
                break;

            case 2:
                System.out.print("Enter the side of the square: ");
                double side = s.nextDouble();
                System.out.println("Area of Square: " + area(side));
                break;

            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = s.nextDouble();
                System.out.println("Area of Circle: " + areaCircle(radius));
                break;

            case 4:
                System.out.print("Enter the base of the triangle: ");
                double base =s.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = s.nextDouble();
                System.out.println("Area of Triangle: " + areaTriangle(base, height));
                break;

            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }

        s.close();
    }
}
