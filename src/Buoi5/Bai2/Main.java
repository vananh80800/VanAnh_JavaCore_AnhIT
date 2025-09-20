package Buoi5.Bai2;

public class Main {
    //Tinh dong goi
    public static void main(String[] args) {
        // Tạo tài khoản
        TaiKhoanNganHang tk1 = new TaiKhoanNganHang("123456", 1000);

        // Nạp tiền
        tk1.napTien(500);

        // Rút tiền
        tk1.rutTien(200);

        // Xem số dư
        tk1.xemSoDu();
    }
}
