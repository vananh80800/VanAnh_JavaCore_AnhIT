package Buoi1;

public class bai3_buoi1 {
    //Diện tích và chu vi hình chữ nhật
    public static void main(String[] args) {
        double width = 5.0;   // chiều rộng
        double height = 10.0; // chiều dài

        double dienTich = width * height;
        double chuVi = (width + height) * 2;

        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều dài: " + height);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
    }
}