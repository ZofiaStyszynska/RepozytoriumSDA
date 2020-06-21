package presentationExercises20june;

public class HomeworkSDA3 {

    public static int addRange(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(addRange(6,22));
    }
}

