package OOP;

public class Person {
    private String name;
    private String surname;
    private int age;
    Address address;

    public Person() {

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void introduce(){
        System.out.println("Imię: " + name + "\n Nazwisko: " + surname);
    }

    public static void main(String[] args) {
        Person kowalski = new Person("Jan","Kowalski",56);
        //kowalski.address.setCountry("Polska");
        kowalski.address = new Address("Poland","Poznań","Ratajczaka",23,8);
        kowalski.introduce();
        kowalski.address.showAdress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
