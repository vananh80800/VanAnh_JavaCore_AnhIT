package Buoi5.Bai1;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng học sinh thứ nhất
        HocSinh hs1 = new HocSinh();
        hs1.ten = "Nguyen Van A";
        hs1.tuoi = 16;
        hs1.lop = "10A1";

        // Tạo đối tượng học sinh thứ hai
        HocSinh hs2 = new HocSinh();
        hs2.ten = "Tran Thi B";
        hs2.tuoi = 17;
        hs2.lop = "11B2";

        // Gọi phương thức HocBai() cho từng học sinh
        hs1.HocBai();
        hs2.HocBai();
    }
}
