package Buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================== Bài 1 ==================
        System.out.println("=== BÀI 1: KIỂM TRA SỐ NGUYÊN ===");
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Số dương");
        } else if (n < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Bằng 0");
        }

        // ================== Bài 2 ==================
        System.out.println("\n=== BÀI 2: MENU ĐỒ UỐNG ===");
        System.out.println("1. Cà phê");
        System.out.println("2. Trà sữa");
        System.out.println("3. Nước lọc");
        System.out.print("Mời bạn chọn (1-3): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Bạn đã chọn: Cà phê");
                break;
            case 2:
                System.out.println("Bạn đã chọn: Trà sữa");
                break;
            case 3:
                System.out.println("Bạn đã chọn: Nước lọc");
                break;
            default:
                System.out.println("Không có trong menu");
                break;
        }
        sc.close();
    }
}

