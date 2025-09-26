import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int last = Math.abs(n % 10);
        System.out.println("Last digit = " + last);

        sc.close();
    }
}
