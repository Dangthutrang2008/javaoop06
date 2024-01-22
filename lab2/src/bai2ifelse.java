import java.util.Scanner;

public class bai2ifelse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a:");
        int a = scanner.nextInt();
        if (a % 2 == 0)
            System.out.println("ket qua la so chan");
        if (a % 2 == 1)
            System.out.println("ket qua la so le");
        scanner.close();
    }
}