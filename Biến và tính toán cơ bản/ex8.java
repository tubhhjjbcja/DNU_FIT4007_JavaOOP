import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        int length = name.length();
        System.out.println("Độ dài tên của bạn là: " + length);
        sc.close();
    }
}
