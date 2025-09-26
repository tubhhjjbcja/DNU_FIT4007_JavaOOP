import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        a = a + b;  // Bây giờ a = a + b
        b = a - b;  // Bây giờ b = a ban đầu
        a = a - b;  // Bây giờ a = b ban đầu

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

        sc.close();
    }
}
