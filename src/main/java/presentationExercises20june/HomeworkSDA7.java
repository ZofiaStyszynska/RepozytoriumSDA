package presentationExercises20june;

public class HomeworkSDA7 {
    public static void main(String[] args) {
        int n = 8; // array length
        int a1 = 5; // first value
        int r = 4; // difference
        int[]arr=new int[n];

        for (int i = 0; i <n; i++) {
            arr[i]=a1 + r*i;
        }
            HomeworkSDA6.arrayPrinter(arr);

    }
}
