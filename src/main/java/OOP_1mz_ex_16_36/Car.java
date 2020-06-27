package OOP_1mz_ex_16_36;

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
}
