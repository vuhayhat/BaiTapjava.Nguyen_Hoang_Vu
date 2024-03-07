package Employee;

public class Main {

    public static void main(String[] args) {
        // Tạo đối tượng PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("vu", 20, 40);

        // Tạo đối tượng FullTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("duy", 4000);

        // In ra thông tin nhân viên
        System.out.println("Nhân viên bán thời gian: " + partTimeEmployee.toString());
        System.out.println("Lương: " + partTimeEmployee.calculateSalary());
        System.out.println();

        System.out.println("Nhân viên toàn thời gian: " + fullTimeEmployee.toString());
        System.out.println("Lương: " + fullTimeEmployee.calculateSalary());
    }
}