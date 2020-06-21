package presentationExercises20june;

public class HomeworkSDA8 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 16};
        int difference = arr[1] - arr[0];
        boolean isArithmetic = true;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != difference) {
                isArithmetic = false;
                break;
            }

        }
        if (isArithmetic) {
            System.out.print("Ciąg ");
            HomeworkSDA6.arrayPrinter(arr);
            System.out.println("jest ciągiem arytmetycznym.");
        } else {
            System.out.print("Ciąg ");
            HomeworkSDA6.arrayPrinter(arr);
            System.out.println("nie jest ciągiem arytmetycznym.");
        }
    }
}

