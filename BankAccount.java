import java.util.Scanner;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("rut tuen thanh cong : " + amount);
        } else {
            System.out.println("tk kh du so du");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ten chu tk: ");
        String owner = scanner.nextLine();

        System.out.print("nhap so du :");
        double initialBalance = scanner.nextDouble();

        BankAccount account1 = new BankAccount(owner, initialBalance);
        System.out.println("Chu tk: " + account1.owner);
        System.out.println("So du ban dau: " + account1.balance);

        System.out.print("Nhap tien muon nap: ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);
        System.out.println("so du sau khi nap: " + account1.balance);

        System.out.print("nhap so tien muon rut: ");
        double withdrawAmount = scanner.nextDouble();
        account1.withdraw(withdrawAmount);
        System.out.println("So du sau khi rut: " + account1.balance);

        scanner.close();
    }
}