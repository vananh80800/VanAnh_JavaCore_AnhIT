package Assignment;

public class Car extends Vehicle {
    private int seatCount; // số ghế

    // Constructor đầy đủ cho Car
    public Car(String brand, String model, int year, double price, String color, int seatCount) {
        super(brand, model, year, price, color, "Car"); // gọi constructor của Vehicle
        this.seatCount = seatCount;
    }

    //Getter
    public int getSeatCount() {
        return seatCount;
    }

    //Setter
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    // Override applyDiscount giảm giá 15%
    @Override
    public double applyDiscount() {
        return getPrice() * 0.85;
    }

    @Override
    public String toString() {
        return super.toString() + " {" + "Seats = " + seatCount + "; Discounted Price = " + applyDiscount() + '}';
    }
}
