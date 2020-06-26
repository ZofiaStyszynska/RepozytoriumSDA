package OOP_3_SDA_ex_11_13;

public class Circle implements Figure {
    private final double PI = 3.1415;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

//
//    public double getPI() {
//        return PI;
//    }
//
//    public void setR(double r) {
//        this.r = r;
//    }

    @Override
    public double getArea(){
        return PI*r*r;
    }
}
