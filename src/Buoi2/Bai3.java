package Buoi2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================== Bài 1: Tính giá vé xem phim ==================
        System.out.println("=== BÀI 1: GIÁ VÉ XEM PHIM ===");
        System.out.print("Nhập tuổi khách: ");
        int age = sc.nextInt();

        if (age < 12) {
            System.out.println("Giá vé: 20.000đ");
        } else if (age <= 17) {
            System.out.println("Giá vé: 40.000đ");
        } else {
            System.out.println("Giá vé: 60.000đ");
        }

        // ================== Bài 2: Xác định mùa theo tháng ==================
        System.out.println("\n=== BÀI 2: XÁC ĐỊNH MÙA ===");
        System.out.print("Nhập số tháng (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Mùa Xuân");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Mùa Hạ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Mùa Thu");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Mùa Đông");
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
                break;
        }

        sc.close();
    }
}

