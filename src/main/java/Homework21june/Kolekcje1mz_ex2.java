package Homework21june;

import java.util.ArrayList;
import java.util.List;

public class Kolekcje1mz_ex2 {
    public static void creatingArrayList(){

    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(16);
        numbers.add(78);
        System.out.println("Długość tej listy to: " +numbers.size());
        System.out.println("Pierwszy el. tej listy to: " +numbers.get(0));
        System.out.println("Ostatni el. tej listy to: "+numbers.get(2));
    }
}
