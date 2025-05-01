import java.util.Scanner;

public class Area {

    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("Choose a shape: 1.Rectangle 2.Square 3.Circle 4.Triangle");
        int choice = sc.nextInt();

        double area = 0;
        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                area = obj.calculateArea(length, width);
                break;
            case 2:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                area = obj.calculateArea(side);
                break;
            case 3:
                System.out.print("Enter radius: ");
                float radius = sc.nextFloat();
                area = obj.calculateArea(radius);
                break;
            case 4:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                area = obj.calculateArea(base, height, true);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Area: " + area);
        sc.close();
    }
}
