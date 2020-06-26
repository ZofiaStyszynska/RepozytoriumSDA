package OOP_3_SDA_ex_11_13;

public class Triangle implements Figure {
    private double base;
    private double high;

    public Triangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    @Override
    public double getArea() {
        return 0.5 * base * high;
    }

//    public double getBase() {
//        return base;
//    }
//
//    public void setBase(double base) {
//        this.base = base;
//    }
//
//    public double getHigh() {
//        return high;
  //  }
//
//    public void setHigh(double high) {
//        this.high = high;
//    }
}
