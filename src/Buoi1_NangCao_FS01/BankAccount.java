package Buoi1_NangCao_FS01;

public class BankAccount {
    // Biến instance (thuộc về từng đối tượng)
    private String accountNumber; // số tài khoản
    private double balance;       // số dư

    // Biến static (dùng chung cho tất cả tài khoản)
    private static double interestRate = 0.05; // lãi suất = 5%

    // Constructor để khởi tạo tài khoản
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber; // gán số tài khoản
        this.balance = balance;             // gán số dư
    }

    // Phương thức tính tiền lãi
    public double calculateInterest() {
        double interest = balance * interestRate; // biến local: tiền lãi
        return interest;
    }

    // Phương thức in thông tin tài khoản
    public void displayInfo() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Số dư: " + balance);
        System.out.println("Tiền lãi: " + calculateInterest());
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1111", 10000);
        BankAccount acc2 = new BankAccount("2222", 20000);
        acc1.displayInfo();
        acc2.displayInfo();
    }
}
