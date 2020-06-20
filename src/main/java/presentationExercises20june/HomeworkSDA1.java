package presentationExercises20june;

import java.util.Scanner;

public class HomeworkSDA1 {


    public static void main(String[] args) {
        System.out.println("Podaj dowolną liczbę całkowitą");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <=4 ; i++) {
            int result = a*i;
            System.out.println(a + "*" + i + "=" + result);


        }

    }
}
