import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            String password = scan.nextLine(); //Hello123 hello2134
            Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,16}$");
            Matcher matcher = pattern.matcher(password);
            System.out.println(matcher.matches() ? "Password is strong" : "Password is weak");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
