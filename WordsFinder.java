import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsFinder {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            String symbol = scan.nextLine();
            String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
            String regex = "\\b" + symbol + "\\w*\\b";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group());
                found = true;
            }
            if (!found){
                System.out.println("There are no words, which starts with \"" + symbol + "\"");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
