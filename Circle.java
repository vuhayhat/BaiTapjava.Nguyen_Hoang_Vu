package Circle;
import java.util.Scanner;

public class Circle {
    private double area;
    private double radius;
    private double perimeter;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void calcArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    public void calcPerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        calcArea();
        calcPerimeter();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double initialRadius = scanner.nextDouble();

        Circle myCircle = new Circle(initialRadius);

        System.out.println("Initial Area: " + myCircle.getArea());
        System.out.println("Initial Perimeter: " + myCircle.getPerimeter());

        System.out.print("Enter a new radius for the circle: ");
        double newRadius = scanner.nextDouble();

        myCircle.setRadius(newRadius);

        System.out.println("Updated Area: " + myCircle.getArea());
        System.out.println("Updated Perimeter: " + myCircle.getPerimeter());

        scanner.close();
    }
}