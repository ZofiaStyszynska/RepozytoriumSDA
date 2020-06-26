package OOP_cd_3_SDA_ex_1_10;

public class Dog implements Animal {
    private String dogsName;

    public Dog(String dogsName) {
        this.dogsName = dogsName;
    }

    public String makeSound() {
        return dogsName + " robi hauuu";
    }

    public String getName() {
        return dogsName;
    }

    public void makeDogsArray() {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Bobek");
        dogs[1] = new Dog("Burek");
        dogs[2] = new Dog("Sunia");
        for (Dog dog : dogs) {
            System.out.println(dog.makeSound());

        }

    }
}
