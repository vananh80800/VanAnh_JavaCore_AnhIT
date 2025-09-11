package Buoi3;

public class Bai8 {
    //Tính tổng các số chẵn trong mảng {1, 2, 3, 4, 5, 6}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println("Tổng các số chẵn = " + sum);
    }
}
