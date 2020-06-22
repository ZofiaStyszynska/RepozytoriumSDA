package Homework21june;

public class Kolekcje1mz_ex1 {
    public static void printTab(int [] tab){
        for (int el:tab) {
            System.out.print("["+el+"]");

        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int[] tab = new int[10];
        // wypełnić liczbami 1-10
        for (int i = 0; i < 10; i++) {
            tab[i] = i + 1;

        }
        //Wyświetlanie długości tablicy
        System.out.println(tab.length);
        // Wyświetlanie zaw. tabl.
        printTab(tab);
        //mnożenie elementów *2
        for (int i = 0; i < tab.length; i++) {
            tab[i]=(i+1)*2;
        }
        printTab(tab);



    }
}

