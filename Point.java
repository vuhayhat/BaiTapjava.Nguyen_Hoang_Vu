public class Point {
    private double x;
    private double y;

    public Point() {

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

    public double distance(double x, double y) {
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    public static void main(String[] args) {

        Point point1 = new Point(1.0, 2.0);


        System.out.println("Toa do 1 diem: (" + point1.getX() + ", " + point1.getY() + ")");


        point1.setXY(3.0, 4.0);


        System.out.println("Toa do moi sau khi di chuyen : (" + point1.getX() + ", " + point1.getY() + ")");


        Point point2 = new Point(5.0, 6.0);


        System.out.println("Khoang cach giua cac toa do: " + point1.distance(point2));
    }
}
