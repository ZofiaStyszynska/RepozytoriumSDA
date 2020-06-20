package presentationExercises20june;

public class HomeworkSDA4 {

    public static void arrayPrinter(int[] arrToPrint) {
        for (int num : arrToPrint) {
            System.out.print("[" + num + "]");

        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] arr = {12, 7, 19};
        int[] arr2 = new int[3];
        arr2[0] = arr[2];
        arr2[1] = arr[1];
        arr2[2] = arr[0];
        arrayPrinter(arr);
        arrayPrinter(arr2);

    }
}
