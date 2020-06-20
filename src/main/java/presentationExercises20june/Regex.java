package presentationExercises20june;

import java.util.regex.Pattern;

public class Regex {
    public static boolean isPeselCorrect (String pesel){
        Pattern peselPattern = Pattern.compile("[0-9]{11}");
        return peselPattern.matcher(pesel).matches();
    }

    public static boolean emailValidation(String emailAddress){
        Pattern emailPattern = Pattern.compile("[0-9a-z_\\.\\-]+@[0-9a-z_\\.\\-]+");
        return emailPattern.matcher(emailAddress).matches();
    }
    public static void main(String[] args){
        System.out.println("Is the PESEL correct: "+ isPeselCorrect("2529465985"));
        System.out.println("Is the email address correct: " + emailValidation("zofia.styszynska@gmail.com"));
    }
}
