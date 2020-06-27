package OOP_1mz_ex_16_36;

public class Main {
    public static void main(String[] args) {
//        Address address = new Address("Poland", "Poznań", "Ratajczaka", 23, 8);
//        Person nowak = new Person("Marek", "Nowak", 33,address);
//        nowak.introduce();
//        Address nowaksAddress = nowak.getAddress();
//        nowaksAddress.showAdress();
//        Person kowalski = new Person("Jan", "Kowalski", 56);
//        kowalski.setAddress(address);
//        kowalski.introduce();
//        kowalski.getAddress().showAdress();
        Engine v8 = new Engine(5,600,15);
        SportCar ferrari = new SportCar("Ferrari", "911", "red",2,v8);
        System.out.println(ferrari.toString());
        ferrari.setRadio("Nowy Swiat");
        System.out.println(ferrari.getRadio());
        System.out.println(ferrari.makeSound());

}}

