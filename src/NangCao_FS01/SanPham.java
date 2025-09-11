package NangCao_FS01;

public class SanPham{
    // Biến instance
    private String tenSanPham;
    private double gia;

    // Biến static: đếm số sản phẩm đã tạo
    private static int count = 0;

    // Constructor
    public SanPham(String tenSanPham, double gia) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        count++; // mỗi lần tạo sản phẩm mới thì tăng 1
    }

    // Phương thức in thông tin sản phẩm
    public void displayInfo() {
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá: " + gia);
        System.out.println("-------------------");
    }

    // Phương thức in tổng số sản phẩm đã tạo
    public static void displayCount() {
        System.out.println("Tổng số sản phẩm đã tạo: " + count);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Banh", 5000);
        SanPham sp2 = new SanPham("Sữa", 12000);
        SanPham sp3 = new SanPham("Kẹo", 3000);
        sp1.displayInfo();
        sp2.displayInfo();
        sp3.displayInfo();
        SanPham.displayCount();
    }
}
