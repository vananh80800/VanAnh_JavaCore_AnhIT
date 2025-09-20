package Buoi5.Bai3;

public class Main {
    //Tinh ke thua
    public static void main(String[] args) {
        // Tạo 1 sinh viên
        SinhVien sv = new SinhVien("Nguyen Van A", 20, "sv001");

        // Gọi phương thức từ lớp cha và lớp con
        sv.gioiThieu(); // từ lớp Nguoi
        sv.hocTap();    // từ lớp SinhVien
    }
}
