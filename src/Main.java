
public class Main {
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("Rectangle Area: " + rectangle.area());
            System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

            Circle circle = new Circle(7);
            System.out.println("Circle Area: " + circle.area());
            System.out.println("Circle Perimeter: " + circle.perimeter());

            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Triangle Area: " + triangle.area());
            System.out.println("Triangle Perimeter: " + triangle.perimeter());

            // Uncomment to test exception
            // Triangle invalidTriangle = new Triangle(1, 2, 3);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
