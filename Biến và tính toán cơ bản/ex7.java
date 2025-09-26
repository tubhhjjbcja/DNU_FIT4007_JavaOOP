import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên (ít nhất 2 chữ số): ");
        int n = sc.nextInt();
        n = Math.abs(n);
        if (n > 9) {
            int secondLast = (n % 100) / 10;
            System.out.println("Chữ số gần cuối của số là: " + secondLast);
        } else {
            System.out.println("Số nhập vào không hợp lệ! Phải có ít nhất 2 chữ số.");
        }
        sc.close();
    }
}
