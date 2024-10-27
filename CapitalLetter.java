import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalLetter {
    public static void main(String[] args) {
        String text = "This is a very intErestIng text. You cAn read It withOut Any problems";
        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("!$0!");
        System.out.println(result);
    }
}
