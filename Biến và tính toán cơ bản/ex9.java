import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b (khác 0): ");
        int b = sc.nextInt();
        if (b != 0) {
            double result = (double) a / b;
            System.out.println(a + " / " + b + " = " + result);
        } else {
            System.out.println("Lỗi: b phải khác 0!");
        }
        sc.close();
    }
}
