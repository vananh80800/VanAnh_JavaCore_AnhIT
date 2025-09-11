package Buoi1;

public class bai2_buoi1 {
    //Hoán đổi 2 biến a và b không dùng biến trung gian
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Trước khi đổi: a = " + a + ", b = " + b);

        // Hoán đổi không dùng biến trung gian
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sau khi đổi: a = " + a + ", b = " + b);
    }
}
