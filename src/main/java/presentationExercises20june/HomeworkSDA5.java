package presentationExercises20june;

public class HomeworkSDA5 {
    public static void maxAndMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

        }
        System.out.println("Największa liczba w tym ciągu to: " +max);
        System.out.println("Najmniejsza liczba w tym ciągu to: "+ min);


    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 78, 34, 1, 15};
        maxAndMin(arr);

    }
}
