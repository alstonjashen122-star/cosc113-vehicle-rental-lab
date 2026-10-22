public class Vehicle {
    public class Car extends Vehicle {
    private int doors;
    String type = "Car";

    public Car(String brand, int year, int doors) {
        super(brand, year);
        setDoors(doors);
    }

    public int getDoors() { return doors; }

    public void setDoors(int doors) {
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            System.out.println("Invalid number of doors. Must be 2 or 4.");
        }
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Doors: " + doors);
    }

    public void showTypes() {
        System.out.println("Type: " + type + " | Parent type: " + super.type);
    }
}
}
