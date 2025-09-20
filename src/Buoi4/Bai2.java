package Buoi4;

public class Bai2 {
    public static void main(String[] args) {
        //Khai báo mảng số nguyên cho sẵn
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0; //Biến lưu tổng

        //Tính tổng các phần tử
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; //Cộng dồn từng phần tử vào sum
        }

        //In kết quả
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
