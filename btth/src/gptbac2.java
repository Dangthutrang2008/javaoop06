import java.util.Scanner;

public class gptbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("he so a la :");
        double a = scanner.nextDouble();
        System.out.printf("he so b la :");
        double b = scanner.nextDouble();
        System.out.printf("he so c la :");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta) / 2 * a);
            double x2 = (-b - Math.sqrt(delta) / 2 * a);
            System.out.printf("phuong trinh co 2 nghiem phan biet");
            System.out.printf("x1 =" + x1);
            System.out.printf("x2 =" + x2);
        } else if (delta == 0) {
            double x = (-b / 2 * a);
            System.out.printf("phuong trinh nghiem kep ");
            System.out.printf("x =" + x);
        } else {
            System.out.printf("phuong trinh vô nghiem ");
        }
        scanner.close();
    }
}
