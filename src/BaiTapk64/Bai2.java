package BaiTapk64;

import java.util.Scanner;

//Bài 2: Viết chương trình tính tổng của các chữ số của một số nguyên dương n trong java. Số nguyên dương n được nhập từ bàn phím.
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        int sum = calculateDigitSum(n);

        System.out.println("Tổng các chữ số của " + n + " là: " + sum);

        scanner.close();
    }

    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
