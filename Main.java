import java.util.Scanner;

public class Main{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle ");
        System.out.println("3. Rectangle");
        System.out.println("4. Cube");
        System.out.println("5. Sphere");
        System.out.println("6. Quit");

        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
            System.out.println("You selected triangle");
            System.out.print("Enter the breath: ");
            double breath = scanner.nextDouble();
            System.out.print("Enter the height: ");
            double height = scanner.nextDouble();
            shape = new Triangle(breath, height);
            
                  break;
            case 2:
            System.out.println("You selected circle");
            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();
            shape = new Circle(radius);
            break;
            case 3:
            System.out.println("You selected rectangle");
            System.out.print("Enter the breath: ");
            double breathr = scanner.nextDouble();
            System.out.print("Enter the height: ");
            double heightr = scanner.nextDouble();
            shape = new Rectangle(breathr, heightr);
            break;
            case 4:
            System.out.println("You selected cube");
            System.out.print("Enter side lenth: ");
            double shapelenth = scanner.nextDouble();
            shape = new Cube(shapelenth);
            break;
            case 5:
            System.out.println("You selected sphere");
            System.out.print("Enter the sphere radius: ");
            double radiusr = scanner.nextDouble();
            shape = new Sphere(radiusr);

            break;
            case 6:
            System.out.print("You decided to quit");
            System.exit(0);
            
            default:
            System.out.println("The selection you choose is invalid");
                
                return;
        }
        System.out.println("Shape is " + shape.getName() );
        System.out.println("Area is " + shape.getArea());
        System.out.println("Volume is " + shape.getVolume());
        scanner.close();
    

}
}