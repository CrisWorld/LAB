
import java.util.Scanner;

/**
 *
 * @author THAYCACAC
 */
public class Main {

    private static Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Re-input");
            }
        }

    }

c

    private static Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = checkInputDouble();
        return new Circle(radius);
    }

    private static void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    }

    public static void main(String[] args) {
        Rectangle rectangle = inputRectangle();
        Circle circle = inputCircle();
        Triangle trigle = inputTriangle();

        display(trigle, rectangle, circle);
    }
}