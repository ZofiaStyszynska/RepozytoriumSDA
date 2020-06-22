package Homework21june;

import java.util.ArrayList;
import java.util.List;

public class Kolekcje1mz_ex4 {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Mateusz");
        namesList.add("Marek");
        namesList.add("Lukasz");
        namesList.add("Jan");
        namesList.add("Maria Magdalena");

        for (String name:namesList) {
            System.out.print(name + ", ");
        }
        System.out.println();
        for (int i = namesList.size(); i>0 ; i--) {
            System.out.print(namesList.get(i-1) + ", ");

        }
    }
}
