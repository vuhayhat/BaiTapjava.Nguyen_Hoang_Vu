package ShapeK64;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }
    @Override
    public double calculateArea(){
        return this.width * this.length;
    }
}
