import java.util.Scanner;

class slide47 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int number, sum = 0;
        do {
            System.out.println("Nhap vao so nguyen bat ki: ");
            number = Scanner.nextInt();
            sum += number;
        } while (sum < 100);
        System.out.println("Tong cac so nguyen vua nhap = " + sum);
        Scanner.close();
    }

}
