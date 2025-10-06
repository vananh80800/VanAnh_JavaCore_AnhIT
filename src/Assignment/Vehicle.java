package Assignment;

public class Vehicle {
    private int id;          // mã xe (tự tăng)
    private String brand;    // hãng xe
    private String model;    // dòng xe
    private int year;        // năm sản xuất
    private double price;    // giá xe
    private String color;    // màu xe
    private String type;     // loại xe

    // Biến static để đếm tổng số xe
    private static int count = 0;

    // Constructor mặc định
    public Vehicle() {
        count++;
    }

    // Constructor mặc định
    public Vehicle(String brand, String model, int year, double price, String color, String type) {
        this.id = ++count; // id tự tăng, mỗi lần tạo xe thì +1
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Static method lấy tổng số xe hiện tại
    public static int getTotalVehicle() {
        return count;
    }

    // Method applyDiscount() sẽ được override ở lớp con
    public double applyDiscount() {
        return price;
    }

    // Static method tiện lợi để giảm/ tăng vehicleCount (nếu cần xóa đối tượng ngoài danh sách)
    public static void decrementCount() {
        if (count > 0) count--;
    }

    // Override toString() để in thông tin xe
    @Override
    public String toString() {
        return "ID: " + id + " |Brand: " + brand + " |Model: " + model + " |Year: " + year + " |Price: " + price + " |Color: " + color + " |Type: " + type;
    }
}
