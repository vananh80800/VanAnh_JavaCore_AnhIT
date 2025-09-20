package Buoi5.Bai3;

public class Nguoi {
    String ten;
    int tuoi;

    public Nguoi(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public void gioiThieu(){
        System.out.println("Tôi tên là " + ten + ", " + tuoi + " tuổi.");
    }
}
