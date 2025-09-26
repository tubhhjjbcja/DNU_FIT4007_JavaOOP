import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            double perimeter = a + b + c;
            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Perimeter = " + perimeter);
            System.out.println("Area = " + area);
        } else {
            System.out.println("Invalid triangle!");
        }
        sc.close();
    }
}
