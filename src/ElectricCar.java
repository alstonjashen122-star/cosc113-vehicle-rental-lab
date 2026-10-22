public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int year, int doors, int batteryLevel) {
        super(brand, year, doors);
        setBatteryLevel(batteryLevel);
    }

    public int getBatteryLevel() { return batteryLevel; }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 100;
        }
    }

    @Override
    public void accelerate(int amount) {
        super.accelerate(amount);
        batteryLevel = Math.max(0, batteryLevel - 1);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
