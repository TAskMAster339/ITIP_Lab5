import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            String password = scan.nextLine(); //Hello123 hello2134
//            Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,16}$");
//            Matcher matcher = pattern.matcher(password);
//            System.out.println(matcher.matches() ? "Password is strong" : "Password is weak");
            Pattern pattern1 = Pattern.compile(".*[A-Z].*");
            Pattern pattern2 = Pattern.compile(".*[a-z].*");
            Pattern pattern3 = Pattern.compile(".*[0-9].*");
            if (password.length() > 16){
                System.out.println("Слишком длинный пароль");
            } else if (password.length() < 8){
                System.out.println("Слишком короткий пароль");
            } else if (!pattern1.matcher(password).matches()){
                System.out.println("Нет большой буквы");
            } else if (!pattern2.matcher(password).matches()){
                System.out.println("Нет маленькой буквы");
            } else if (!pattern3.matcher(password).matches()){
                System.out.println("Нет цифры");
            } else {
                System.out.println("Пароль правильный");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
