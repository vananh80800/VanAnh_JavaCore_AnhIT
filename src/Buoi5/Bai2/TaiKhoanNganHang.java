package Buoi5.Bai2;

public class TaiKhoanNganHang {
    private String soTaiKhoan;
    private double soDu;

    // Constructor để tạo tài khoản
    public TaiKhoanNganHang(String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu = soDu+ soTien;
            System.out.println("Nạp " + soTien + " thành công.");
        } else {
            System.out.println("Số tiền nạp không hợp lệ.");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu =soDu - soTien;
            System.out.println("Rút " + soTien + " thành công.");
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc vượt quá số dư.");
        }
    }

    public void xemSoDu() {
        System.out.println("Số dư hiện tại: " + soDu);
    }
}
