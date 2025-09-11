package Buoi3;

public class Bai3 {
    //Tính tổng các số từ 1 → 100
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Tổng từ 1 đến 100 = " + sum);
    }
}

