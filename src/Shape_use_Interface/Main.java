package Shape_use_Interface;

public class Main {
    public static void main(String[] args) {
        // Tạo một mảng các hình chứa các đối tượng Circle và Rectangle
        IShape circle = new Circle(5.0); // Hình tròn với bán kính là 5
        IShape rectangle = new Rectangle(4, 6); // Hình chữ nhật với chiều rộng là 4 và chiều dài là 6


        // Tạo một mảng các hình
        IShape[] shapes = {circle, rectangle};

        // Duyệt qua mảng các hình và hiển thị thông tin của từng hình
        for (IShape shape : shapes) {
            // Lấy tên của lớp
            String shapeName = shape.getClass().getSimpleName();
            // Hiển thị thông tin của hình
            System.out.println("Hình: " + shapeName);
            System.out.println("Diện tích: " + shape.getArea());
            System.out.println("Chu vi: " + shape.getPerimeter());

        }
    }
}