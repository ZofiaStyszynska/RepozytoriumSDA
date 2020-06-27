package OOP_1mz_ex_16_36;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SportCar extends Car {
    public SportCar(String producer, String model, String color, int seatsNumber, Engine engine) {
        super(producer, model, color, seatsNumber, engine);
//        this.producer=producer;
//        this.model=model;
//        this.color = color;
//        this.seatsNumber = seatsNumber;
//        this.engine = engine;
        this.sound= "Brum";
    }
    public String makeSound(){
        return this.sound;
    }
        private String radio;
        private String sound;

    public SportCar(String producer, String model, String color, int seatsNumber){
        super(producer, model, color);
        this.seatsNumber = seatsNumber;
    }

}
