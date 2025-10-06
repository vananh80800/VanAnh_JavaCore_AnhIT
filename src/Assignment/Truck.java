package Assignment;

public class Truck extends Vehicle {
    private double loadCapacity; // tải trọng

    // Constructor đầy đủ cho Truck
    public Truck(String brand, String model, int year, double price, String color, double loadCapacity) {
        super(brand, model, year, price, color, "Truck"); // gọi constructor của Vehicle
        this.loadCapacity = loadCapacity;
    }

    //Getter
    public double getLoadCapacity() {
        return loadCapacity;
    }

    //Setter
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    // Override applyDiscount giảm giá 20%
    @Override
    public double applyDiscount() {
        return getPrice() * 0.80;
    }

    @Override
    public String toString() {
        return super.toString() + " {" + "Load Capacity = " + loadCapacity + "; Discounted Price = " + applyDiscount() + '}';
    }
}
