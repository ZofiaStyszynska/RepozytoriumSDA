package OOP_cd_3_SDA_ex_1_10;

public class Cat implements Animal,Movable {

    private String catsName;

    public Cat(String catsName) {
        //super(catsName);
        this.catsName = catsName;
    }

    public String makeSound() {

        return catsName + " robi miaaau";
    }

    public static void makeCatsArray() {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Filemon");
        cats[1] = new Cat("Bonifacy");
        cats[2] = new Cat("Filonek");
        cats[3] = new Cat("Kotando");
        for (Cat cat : cats) {
            System.out.println(cat.makeSound());

        }
    }

    public void eatMouse() {
        int eatenMice = 0;
        eatenMice++;
        System.out.println("Zjadłem " + eatenMice + " myszy");
    }

    public static void makeAnimalsArray() {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Mruczek");
        animals[1] = new Dog("Pankracy");
        animals[2] = new Cat("Meja");
        animals[3] = new Dog("Rumba");
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

        }

    }


    public String getName() {
        return catsName;
    }

    public void setCatsName(String catsName) {
        this.catsName = catsName;
    }

    @Override
    public String move() {
        System.out.println("idę");
        return "idę";
    }

    public static void main(String[] args) {
        makeAnimalsArray();
        Cat mruczek = new Cat("Mruczek");
        mruczek.move();

    }


}
