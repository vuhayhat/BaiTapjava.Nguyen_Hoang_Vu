package BaiTapk64;



public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calcArea();
        calcPerimeter();
    }
    public void calcArea() {
        this.area = length * width;
    }
    public void calcPerimeter() {
        this.perimeter = 2 * (length + width);
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setLength(double length) {
        this.length = length;
        calcArea();
        calcPerimeter();
    }
    public void setWidth(double width) {
        this.width = width;
        calcArea();
        calcPerimeter();
    }
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(87, 90);
        System.out.println("Length: " + myRectangle.length);
        System.out.println("Width: " + myRectangle.width);
        System.out.println("Area: " + myRectangle.getArea());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());
    }
}
