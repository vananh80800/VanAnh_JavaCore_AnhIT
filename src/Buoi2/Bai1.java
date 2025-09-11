package Buoi2;

import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================== Bài 1 ==================
        System.out.println("===Bài 1: Kiểm tra số chẵn lẻ===");
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }

        // ================== Bài 2 ==================
        System.out.println("===Bài 2: Kiểm tra tuổi lái xe===");
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Đủ điều kiện lái xe");
        } else {
            System.out.println("Chưa đủ điều kiện lái xe");
        }

        // ================== Bài 3 ==================
        System.out.println("===Bài 3: Kiểm tra qua môn===");
        System.out.print("Nhập điểm (0-100): ");
        int score = sc.nextInt();
        if (score >= 50) {
            System.out.println("Qua môn");
        } else {
            System.out.println("Trượt");
        }

        // ================== Bài 4 ==================
        System.out.println("===Bài 4: Xếp loại học lực===");
        System.out.print("Nhập điểm (0-100): ");
        int mark = sc.nextInt();
        if (mark >= 85) {
            System.out.println("Giỏi");
        } else if (mark >= 65) {
            System.out.println("Khá");
        } else if (mark >= 50) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }

        sc.close();
    }
}
