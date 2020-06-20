package presentationExercises20june;

public class HomeworkSDA6 {
    public static void main(String[] args) {
        int []arr= {23, -15, 9 , 0, -7, -6};
        arrayPrinter(arr);

        int sumOfNegativeNumbers = 0;
        for (int num:arr) {
            if (num<0){
                sumOfNegativeNumbers++;
            }
        }
        System.out.println("Liczba ujemnych liczb w tym ciągu to: "+ sumOfNegativeNumbers);
        negativesExtractor(arr, sumOfNegativeNumbers);

    }
    public static void negativesExtractor (int[]array, int sumOfNegativeNumbers){
        int []arrayOfNegatives = new int[sumOfNegativeNumbers];
        int i=0;
        for (int num:array) {
            if (num<0){
                arrayOfNegatives[i] = num;
                i++;

                }

            }
        arrayPrinter(arrayOfNegatives);


        }

    public static void arrayPrinter(int[] arrToPrint) {
        for (int num : arrToPrint) {
            System.out.print("[" + num + "]");

        }
        System.out.print("\n");
    }


}
