package OOP_1mz_ex_16_36;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;

    public Person() {
        this.name="Marian";
        this.surname= "Kowalski";
        this.age = 49;

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    //    public Person(String name, String surname, int age, Address address) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.address = address;
//    }

    public void introduce(){
        System.out.println("Imię: " + name + "\n Nazwisko: " + surname);
    }


}
