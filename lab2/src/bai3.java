import java.util.Scanner;

class bai3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("nhap ten ");
        String ten = Scanner.next();
        System.out.print("Nhap nam sinh : ");
        int ngaysinh = Scanner.nextInt();
        if ((2024 - ngaysinh) >= 18) {
            System.out.println(ten + " da gia");
        } else if ((2024 - ngaysinh) >= 16) {
            System.out.println(ten + " o do tuoi truong thanh");
        } else {
            System.out.println(ten + " o do tuoi vi thanh nien");
        }

        Scanner.close();
    }
}
