package BaiTapk64;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate distance between two points
    public double distance(double x, double y) {
        return Math.abs(x - y);
    }

    // Calculate distance between this point and another point
    public double distance(Point another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
    }

    public static void main(String[] args) {
        // Example usage
        Point point1 = new Point();
        Point point2 = new Point(9.0, 6.0);
        System.out.println("Distance between points: " + point1.distance(point2));
    }
}
