package presentationExercises20june;

import java.util.Scanner;

public class HomeworkSDA2 {


    public static boolean checkPrimeNum(int a) {
        boolean isDivisible = false;

        for (int i = 2; i < a/2; i++) {
            int result = a % i;
            if (result == 0) {
                isDivisible = true;
                System.out.println("Znaleziono dzielnik: "+ i);
                break;
            }
        }
       return isDivisible;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą większą od 1");

        int a = scanner.nextInt();

        boolean isPrime = checkPrimeNum(a);
        if (isPrime) {
            System.out.println("To nie jest liczba pierwsza.");
        } else {
            System.out.println("To jest liczba pierwsza.");
        }

    }
}
