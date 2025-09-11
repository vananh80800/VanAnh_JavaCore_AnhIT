package NangCao_FS01;

public class hoc_sinh {
    // Biến instance
    private String name;  // tên
    private int age;      // tuổi
    private double gpa;   // điểm trung bình

    // Biến static (chung cho tất cả sinh viên)
    private static String schoolName = "Trường THPT A";

    // Constructor
    public hoc_sinh(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        String rank; // biến local rank để xếp loại
        if (gpa >= 8.0) {
            rank = "Giỏi";
        } else if (gpa >= 6.5) {
            rank = "Khá";
        } else {
            rank = "Trung bình";
        }

        // In thông tin
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Xếp loại: " + rank);
        System.out.println("Trường: " + schoolName);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        hoc_sinh hs1 = new hoc_sinh("An", 16, 8.5);
        hoc_sinh hs2 = new hoc_sinh("Bình", 17, 7.0);
        hs1.displayInfo();
        hs2.displayInfo();
    }
}