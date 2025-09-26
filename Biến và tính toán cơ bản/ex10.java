import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập 1 ký tự thường (a-y): ");
        char ch = sc.next().charAt(0);

        char nextChar = (char)(ch + 1);
        System.out.println("Ký tự liền sau: " + nextChar);

        sc.close();
    }
}
