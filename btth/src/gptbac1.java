
import java.util.Scanner;

class gptbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("he so a la :");
        double a = scanner.nextDouble();
        System.out.printf("he so b la :");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.printf("phuong trinh vo so nghiem");
            } else {
                System.out.printf("phuong trinh vo nghiem");
            }
        } else {
            Double x = -b / a;
            System.out.printf("phuong trinh co nghiem x la : " + x);
        }
        scanner.close();
    }
}