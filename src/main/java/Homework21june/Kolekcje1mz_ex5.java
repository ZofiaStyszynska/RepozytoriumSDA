package Homework21june;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kolekcje1mz_ex5 {

    public static List<String> getNamesFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<String> nameList = new ArrayList<>();
        System.out.println("Podaj pięć dowolnych imion");

    //Pobiera od użytkownika pięć imion w pętli i wpisuje do ArrayList
        for (int i = 0; i < 5; i++) {
            nameList.add(scanner.next());
        }

        return nameList;
    }

    public static void printList(List<String> nameList) {
        for (String name : nameList) {
            System.out.print(name + ", ");
        }
    }

    public static void main(String[] args) {
        printList(getNamesFromUser());


    }
}
