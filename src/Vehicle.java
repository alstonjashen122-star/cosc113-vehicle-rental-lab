public class Vehicle {
    private String brand;
    private int year;
    private int speed;
    String type = "Vehicle";

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.speed = 0;
    }

    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public int getSpeed() { return speed; }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed rejected.");
        }
    }

    public void describe() {
        System.out.println("Vehicle: " + brand + " (" + year + ")");
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            this.speed += amount;
        }
    }
}
