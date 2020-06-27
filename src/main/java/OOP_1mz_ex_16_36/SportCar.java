package OOP_1mz_ex_16_36;

public class SportCar extends Car {
    public SportCar(String producer, String model, String color, int seatsNumber, Engine engine) {
        this.producer=producer;
        this.model=model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }
    public SportCar(String producer, String model, String color, int seatsNumber){
        super(producer, model, color);
        this.seatsNumber = seatsNumber;
    }

}
