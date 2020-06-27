package OOP_1mz_ex_16_36;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
abstract class Car {
    String producer;
    String model;
    String color;
    int seatsNumber;
    Engine engine;

    public Car() {
        seatsNumber = 2;
    }

    public Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    public Car(String producer, String model, String color, int seatsNumber, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", engine=" + engine +
                '}';
    }
}
