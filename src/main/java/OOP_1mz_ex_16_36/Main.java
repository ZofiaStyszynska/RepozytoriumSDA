package OOP_1mz_ex_16_36;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Poland", "Poznań", "Ratajczaka", 23, 8);
        Person nowak = new Person("Marek", "Nowak", 33,address);
        nowak.introduce();
        Address nowaksAddress = nowak.getAddress();
        nowaksAddress.showAdress();
        Person kowalski = new Person("Jan", "Kowalski", 56);
        kowalski.setAddress(address);
        kowalski.introduce();
        kowalski.getAddress().showAdress();
    }
}

