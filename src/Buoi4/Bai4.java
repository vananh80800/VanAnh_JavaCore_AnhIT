package Buoi4;

public class Bai4 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 10, 13};

        int countChan = 0; //Biến đếm số chẵn
        int countLe = 0;   //Biến đếm số lẻ

        //Duyệt qua mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countChan++; //Nếu chia hết cho 2 thì là số chẵn
            } else {
                countLe++;   //Số lẻ
            }
        }

        System.out.println("Có " + countChan + " số chẵn trong mảng");
        System.out.println("Có " + countLe + " số lẻ trong mảng");
    }
}
