package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static ArrayList<Vehicle> vehicles = new ArrayList<>();// danh sách xe
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int choice = -1; // khởi tạo choice khác 0 để vào vòng while
        while (choice != 0) { // lặp đến khi người dùng chọn 0 (Thoát)
            // In menu ra màn hình
            System.out.println("===== QUẢN LÝ GARA XE =====");
            System.out.println("1. Thêm xe mới");
            System.out.println("2. Xóa xe theo ID");
            System.out.println("3. Hiển thị danh sách xe");
            System.out.println("4. Tìm kiếm xe theo hãng");
            System.out.println("5. Sắp xếp xe theo giá tăng dần");
            System.out.println("6. Sắp xếp xe theo năm sản xuất giảm dần");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            try {
                choice = Integer.parseInt(sc.nextLine().trim()); // đọc dòng và parse thành int
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ."); // báo lỗi nhập
                continue; // quay lại menu
            }

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    removeVehicle();
                    break;
                case 3:
                    displayVehicles();
                    break;
                case 4:
                    searchByBrand();
                    break;
                case 5:
                    sortByPriceAsc();
                    break;
                case 6:
                    sortByYearDesc();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
        sc.close(); // đóng Scanner khi kết thúc chương trình
    }

    //Thêm xe mới
    public static void addVehicle() {
        System.out.println("Chọn loại xe: 1.Car  2.Truck");
        int type = Integer.parseInt(sc.nextLine());
        if (type != 1 && type != 2) {
            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại");
            return; // thoát khỏi phương thức, không nhập tiếp
        }
        System.out.print("Brand: ");
        String brand = sc.nextLine();
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Color: ");
        String color = sc.nextLine();

        if (type == 1) {
            System.out.print("Seats: ");
            int seats = Integer.parseInt(sc.nextLine());
            // Tạo đối tượng Car và thêm vào danh sách
            Car car = new Car(brand, model, year, price, color, seats);
            vehicles.add(car); // thêm vào ArrayList
            System.out.println("Đã thêm Car với ID: " + car.getId());
        } else if (type == 2) {
            System.out.print("Load Capacity: ");
            double load = Double.parseDouble(sc.nextLine());
            // Tạo đối tượng Truck và thêm vào danh sách
            Truck truck = new Truck(brand, model, year, price, color, load);
            vehicles.add(truck); // thêm vào ArrayList
            System.out.println("Đã thêm Truck với ID: " + truck.getId());
        }
    }

    // Xóa xe theo ID
    public static void removeVehicle() {
        System.out.println("Nhập ID cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean removed = false;// kiểm tra đã xóa hay chưa
        Iterator<Vehicle> it = vehicles.iterator(); // dùng Iterator để xóa an toàn khi duyệt
        while (it.hasNext()) {
            Vehicle v = it.next();// lấy phần tử hiện tại
            if (v.getId() == id) {// nếu id trùng
                it.remove();
                Vehicle.decrementCount();// giảm số lượng xe (static)
                removed = true;// đánh dấu đã xóa
                System.out.println("Đã xóa xe có ID = " + id);
                break;
            }
        }
        if (!removed) {
            System.out.println("Không tìm thấy xe có ID = " + id);
        }
    }

    //Hiển thị danh sách xe
    public static void displayVehicles() {
        if (vehicles.isEmpty()) {// kiểm tra danh sách rỗng
            System.out.println("Không có xe trong gara.");
        } else {
            System.out.println("Danh sách xe hiện có:");
            for (Vehicle v : vehicles) {
                System.out.println(v);
            }
            System.out.println("Tổng số xe hiện tại: " + Vehicle.getTotalVehicle());
            if (Vehicle.getTotalVehicle() > 20) {
                System.out.println("Gara lớn");
            } else {
                System.out.println("Gara nhỏ");
            }
        }
    }

    // Tìm kiếm theo hãng
    public static void searchByBrand() {
        System.out.print("Nhập hãng xe cần tìm: ");
        String brand = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            if (v.getBrand() != null && v.getBrand().equalsIgnoreCase(brand)) { // so sánh không phân biệt hoa thường
                System.out.println(v);
                found = true; // đã tìm thấy
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy xe hãng '" + brand + "'.");
        }
    }

    // Sắp xếp theo giá tăng dần
    public static void sortByPriceAsc() {
        vehicles.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
        System.out.println("Danh sách xe sau khi sắp xếp theo giá tăng dần : ");
        // Duyệt và in danh sách xe sau khi sắp xếp
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    // Sắp xếp theo năm giảm dần
    public static void sortByYearDesc() {
        vehicles.sort((a, b) -> Integer.compare(b.getYear(), a.getYear()));
        System.out.println("Danh sách xe sau khi sắp xếp theo năm giảm dần : ");
        // Duyệt và in danh sách xe sau khi sắp xếp
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
