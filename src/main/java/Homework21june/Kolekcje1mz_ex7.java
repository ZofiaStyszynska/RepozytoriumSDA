package Homework21june;

import java.util.ArrayList;
import java.util.List;

public class Kolekcje1mz_ex7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(76);
        list.add(453);
        list.add(87);
        list.add(6);
        try {
            System.out.println(list.get(6));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }
    }
}
