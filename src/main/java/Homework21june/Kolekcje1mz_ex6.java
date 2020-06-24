package Homework21june;

import java.util.*;

public class Kolekcje1mz_ex6 {
    public static void printList(Queue<Integer> randomList) {
        for (int num : randomList) {
            System.out.print(num + ", ");
        }
    }
    public static Queue<Integer> getNumFromUser(Queue<Integer> randomList){
        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();
        int randomNum = new Random().nextInt(100)+1;


        for (int i = 0; i <howMany ; i++) {
            randomList.add(randomNum);
        }
        printList(randomList);
        return randomList;
    }

    public static void main(String[] args) {
        Queue<Integer> randomList = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wylosować?");
        int howMany = scanner.nextInt();



        for (int i = 0; i <howMany ; i++) {
            int randomNum = new Random().nextInt(100)+1;
            randomList.add(randomNum);
        }

        printList(randomList);
        //getNumFromUser(randomList);
        //printList(getNumFromUser(randomList));
    }
}
