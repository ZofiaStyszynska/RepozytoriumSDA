package OOP_cd_3_SDA_ex_1_10;

public class Vet {


//    public static void sayHello (Cat cat){
//        System.out.println("Hello " + cat.getName());
//    }
//    public static void sayHello (Dog dog){
//        System.out.println("Hello " + dog.getName());
    //}
    public static void sayHello (Animal animal){
        System.out.println("Hello " + animal.getName());
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Filemon");
        Dog dog = new Dog("Lessi");

       sayHello(cat);
       sayHello(dog);

    }
}
