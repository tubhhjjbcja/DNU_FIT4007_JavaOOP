import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age in 2023: ");
        int age = sc.nextInt();
        int birthYear = 2023 - age;
        System.out.println("Birth year = " + birthYear);
        sc.close();
    }
}
