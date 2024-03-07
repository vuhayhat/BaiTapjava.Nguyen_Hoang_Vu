package Employee;

public class FullTimeEmployee extends Employee {

    private int paymentPerMonth;

    public FullTimeEmployee(String name, int paymentPerMonth) {
        super(name, 0); // Đặt paymentPerHour thành 0 cho nhân viên toàn thời gian
        this.paymentPerMonth = paymentPerMonth;
    }

    public int getPaymentPerMonth() {
        return paymentPerMonth;
    }

    public void setPaymentPerMonth(int paymentPerMonth) {
        this.paymentPerMonth = paymentPerMonth;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerMonth();
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + getName() + '\'' +
                ", paymentPerMonth=" + paymentPerMonth +
                '}';
    }
}