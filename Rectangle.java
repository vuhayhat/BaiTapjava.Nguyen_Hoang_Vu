package Rectangle;
import java.util.Scanner;

public class Rectangle {
    private double area;
    private double length;
    private double perimeter;
    private double width;

    // khởi tạo hình chữ nhật với chiều dài và chiều rộng
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void calculateArea() {
        area = length * width;
    }

    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }


    public void setLength(double length) {
        this.length = length;
        calculateArea();
        calculatePerimeter();
    }

    public void setWidth(double width) {
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle myRectangle = new Rectangle(length, width);

        System.out.println("Initial Area: " + myRectangle.getArea());
        System.out.println("Initial Perimeter: " + myRectangle.getPerimeter());

        System.out.print("Enter a new length for the rectangle: ");
        double newLength = scanner.nextDouble();
        myRectangle.setLength(newLength);

        System.out.print("Enter a new width for the rectangle: ");
        double newWidth = scanner.nextDouble();
        myRectangle.setWidth(newWidth);

        System.out.println("Updated Area: " + myRectangle.getArea());
        System.out.println("Updated Perimeter: " + myRectangle.getPerimeter());

        scanner.close();
    }
}