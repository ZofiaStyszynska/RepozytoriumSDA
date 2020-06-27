package Homework21june;

import java.util.*;

public class Kolekcje1mz_ex5_v_2 {
    public static void main(String[] args) {


        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");
        Iterator<String> countriesIterator = countries.iterator();
        while (countriesIterator.hasNext()) {
            System.out.println(countriesIterator.next());
        }
    }
}