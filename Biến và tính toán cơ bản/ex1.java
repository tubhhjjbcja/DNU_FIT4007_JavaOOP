import java.util.Scanner;

 class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        System.out.println("Tổng của a và b = " + (a + b));
        System.out.println("Hiệu của a và b= " + (a - b));
        System.out.println("Tích của a và b= " + (a * b));
        System.out.println("Thương  của a và b= " + ((double) a / b));
        sc.close();
    }
}