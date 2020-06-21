package exercises21june;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat mruczek = new Cat();
        Dog burek = new Dog();
        List<Animal> listOfAnimals = new java.util.ArrayList<>();
        listOfAnimals.add(mruczek);
        listOfAnimals.add(burek);
        for (Animal animal : listOfAnimals) {
            System.out.println(animal.makeSound());
        }
    }
}
