package Buoi4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n=sc.nextInt();//Nhập số lượng phần tử mảng (n)

        int[] arr = new int[n];//Khai báo mảng arr có n phần tử

        //Nhập các phần tử vào mảng
        for(int i=0;i<n;i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i]=sc.nextInt();//Gán giá trị nhập vào arr[i]
        }

        //In ra các phần tử trong mảng
        System.out.println("Các phần tử trong mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); //In từng phần tử ra màn hình
        }
    }
}
