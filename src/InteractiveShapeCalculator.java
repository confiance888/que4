import java.util.Scanner;

public class InteractiveShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("=== Welcome to Interactive Shape Area Calculator ===\n");

        while (continueProgram) {
            // Display menu
            System.out.println("Choose a shape to calculate area:");
            System.out.println("1 = Circle");
            System.out.println("2 = Rectangle");
            System.out.println("3 = Triangle");
            System.out.println("4 = Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            Shape shape = null;

            // Using switch statement for shape selection
            switch (choice) {
                case 1:
                    // Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();

                    if (radius > 0) {
                        shape = new Circle(radius);
                    } else {
                        System.out.println("Error: Radius must be positive!");
                        break;
                    }
                    break;

                case 2:
                    // Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();

                    if (length > 0 && width > 0) {
                        shape = new Rectangle(length, width);
                    } else {
                        System.out.println("Error: Length and width must be positive!");
                        break;
                    }
                    break;

                case 3:
                    // Triangle
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();

                    if (base > 0 && height > 0) {
                        shape = new Triangle(base, height);
                    } else {
                        System.out.println("Error: Base and height must be positive!");
                        break;
                    }
                    break;

                case 4:
                    // Exit
                    continueProgram = false;
                    System.out.println("Thank you for using Shape Area Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
                    break;
            }

            // Display results if shape was created successfully
            if (shape != null) {
                System.out.println("\n=== Results ===");
                shape.displayShapeInfo();
                System.out.println();
            }

            System.out.println("------------------------");
        }

        scanner.close();
    }
}