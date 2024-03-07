package ShapeK64;

public class Circle extends Shape {
    double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return this.radius * this.radius * Math.PI;
    }
}
