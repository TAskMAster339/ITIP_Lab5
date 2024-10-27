import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckIPAddress {
    public static void main(String[] args) {
        try{
            String IP = "192.168.1.255";
            Pattern pattern = Pattern.compile("((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])");
            Matcher matcher = pattern.matcher(IP);
            System.out.println(matcher.matches());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
