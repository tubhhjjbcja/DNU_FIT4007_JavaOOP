import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        int c = a; // lưu tạm giá trị của a
        a = b;
        b = c;

        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

        sc.close();
    }
}
