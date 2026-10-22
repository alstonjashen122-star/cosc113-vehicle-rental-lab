public class Vehicle {
    public class Vehicle {
    private String brand;
    private int year;
    private int speed;
    String type = "Vehicle"; // package-visible so it can be hidden by the child

    // Parameterized Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.speed = 0;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    // Setter with validation against negative values
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed rejected.");
        }
    }

    // Describe method
    public void describe() {
        System.out.println("Vehicle: " + brand + " (" + year + ")");
    }

    // Accelerate method
    public void accelerate(int amount) {
        if (amount > 0) {
            this.speed += amount;
        }
    }
}
}
