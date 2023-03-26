import java.util.regex.Pattern ;
import java.util.regex.Matcher ;

public class GUI_INTERFACE {
    public static void main(String[] args) {


        Pattern email = Pattern.compile("@Gmail.com", Pattern.CASE_INSENSITIVE);
        Matcher new_email = email.matcher("This is my email, emma@gmail.com");
        boolean results = new_email.find();
        if (results) {
            System.out.println("It has email address");
        } else {
            System.out.println("No email address");
        }


    }
}
