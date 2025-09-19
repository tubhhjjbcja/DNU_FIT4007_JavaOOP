import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;
        System.out.println("Chu vi hình chữ nhật = " + chuVi);
        System.out.println("Diện tích hình chữ nhật = " + dienTich);
        scanner.close();
    }
}
