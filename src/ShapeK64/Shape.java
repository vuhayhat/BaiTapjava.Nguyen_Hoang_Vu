package ShapeK64;
import java.util.Scanner;

public class Shape {
    double area;
    String name;
    public Shape(String name) {
        this.name = name;
    }
    double calculateArea(){
        this.area = 0;
        return this.area;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong HCN : ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai HCN: ");
        double length = scanner.nextDouble();
        Rectangle hcn = new Rectangle("hinh chu nhat", width, length);
        hcn.calculateArea();
        System.out.println("Dien tich hinh chu nhat la:" + hcn.calculateArea());

        System.out.print("Nhap ban kinh Hinh tron: ");
        double radius = scanner.nextDouble();
        Circle ht = new Circle("Hinh tron", radius);
        ht.calculateArea();
        System.out.print("Dien tich hinh tron la: "+ ht.calculateArea());

        scanner.close();
    }
}
