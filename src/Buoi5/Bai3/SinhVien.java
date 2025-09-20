package Buoi5.Bai3;

public class SinhVien extends Nguoi{
    String maSV;

    //Constructor
    public SinhVien(String ten, int tuoi, String maSV) {
        super(ten, tuoi);// Gọi constructor của lớp cha
        this.maSV = maSV;
    }

    // Phương thức học tập
    public void hocTap() {
        System.out.println("Sinh viên " + ten + " (MSSV: " + maSV + ") đang học tập.");
    }
}
