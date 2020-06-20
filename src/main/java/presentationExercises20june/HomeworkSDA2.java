package presentationExercises20june;

import java.util.Scanner;

public class HomeworkSDA2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą większą od 1");

        int a = scanner.nextInt();
        boolean isDivisible = false;
        int b=0;

        for (int i = 2; i < a; i++) {
            int result = a%i;
            if (result==0){
                isDivisible=true;
                b=i;
                break;
            }
        }
        if (isDivisible){
            System.out.println("To nie jest liczba pierwsza. Ta liczba jest podzielna przez " + b);
        }else {
            System.out.println("To jest liczba pierwsza.");
        }
    }
}
