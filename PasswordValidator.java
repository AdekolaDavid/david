//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class PasswordValidator {
//    private Pattern pattern;
//    private Matcher matcher;
//
//    public static void main(String[] args){
//        "^(?=.*[0-9])"
//                + "(?=.*[a-z])(?=.*[A-Z])"
//                + "(?=.*[@#$%^&+=])"
//                + "(?=\\S+$).{8,20}$";
//
//    }
//}
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Adekola123@gmail.com";
        boolean isCorrect = checkPassword(password);
        if (isCorrect) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }

    public static boolean checkPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

