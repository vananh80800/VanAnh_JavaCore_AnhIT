package Buoi4;

import java.util.Scanner;

public class Bai4_NangCao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Tạo đối tượng Scanner để nhập dữ liệu

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt(); //Nhập số phần tử của mảng

        int[] arr = new int[n]; //Khai báo mảng có n phần tử

        //Nhập giá trị cho từng phần tử trong mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int countChan = 0; //Biến đếm số chẵn
        int countLe = 0;   //Biến đếm số lẻ

        // Duyệt qua mảng để đếm
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countChan++;//Nếu chia hết cho 2 thì tăng số chẵn
            } else {
                countLe++;//Số lẻ
            }
        }

        // Xuất kết quả
        System.out.println("Có " + countChan + " số chẵn trong mảng.");
        System.out.println("Có " + countLe + " số lẻ trong mảng.");
    }
}
