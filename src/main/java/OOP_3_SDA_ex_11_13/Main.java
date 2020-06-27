package OOP_3_SDA_ex_11_13;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,7.9);
        Triangle triangle = new Triangle(5.3,3);
        Circle circle = new Circle(3.4);
        Figure [] figures = {rectangle,triangle,circle};


        System.out.println(TotalArea.enoughPaint(TotalArea.sumUpAreas(figures), 100));

    }
}

