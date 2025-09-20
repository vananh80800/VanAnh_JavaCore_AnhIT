package Buoi4;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Nhập dữ liệu từ bàn phím

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt(); //Nhập số phần tử mảng

        int[] arr = new int[n]; //Tạo mảng có n phần tử

        //Nhập giá trị cho từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        //Giả sử phần tử đầu tiên là lớn nhất
        int max = arr[0];

        //So sánh từng phần tử để tìm số lớn nhất
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
