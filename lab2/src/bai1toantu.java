import java.util.Scanner;

class bai1toantu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("so a la :");
        double a = scanner.nextDouble();

        System.out.println("so b la :");
        double b = scanner.nextDouble();

        double tong = a + b;
        System.out.println("tong la " + tong);

        double hieu;
        if (a <= b) {
            hieu = a - b;
        } else {
            hieu = b - a;
        }
        System.out.println("hieu la " + hieu);

        double tich = a * b;
        System.out.println("tich la " + tich);

        double thuong = a / b;
        System.out.println("thuong la " + thuong);

        if (a > b) {
            System.out.println("a lon hon b");
        }
        if (a == b) {
            System.out.println("a bang b");
        }
        if (a < b) {
            System.out.println("a nho hon b");
        }
        scanner.close();
    }
}