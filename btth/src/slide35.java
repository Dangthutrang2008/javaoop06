import java.util.Scanner;

class slide35 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("so thu nhat la :");
        int a = Scanner.nextInt();
        System.out.printf("so thu hai la :");
        int b = Scanner.nextInt();
        if (a > b) {
            System.out.println("so nho nhat la so thu hai");
        } else if (a == b) {
            System.out.println("2 so bang nhau");
        } else {
            System.out.println("so nho nhat la so thu nhat");
        }
        Scanner.close();
    }
}
