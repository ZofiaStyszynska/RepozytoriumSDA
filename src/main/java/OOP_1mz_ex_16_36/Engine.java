package OOP_1mz_ex_16_36;

public class Engine {
    private double capacity;
    private double horsePower;
    private double fuelConsumption;

    public Engine(double capacity, double horsePower, double fuelConsumption){
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;


    }

    public double getCapacity() {
        return capacity;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
