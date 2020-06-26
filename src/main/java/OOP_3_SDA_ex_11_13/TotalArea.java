package OOP_3_SDA_ex_11_13;

public class TotalArea {
    public static double sumUpAreas(Figure[] figures) {
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;

    }

    public static boolean enoughPaint(double totalArea, double possibleArea) {
        return totalArea <= possibleArea;
    }
}

