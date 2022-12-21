package Task3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner inp = new Scanner(System.in);
        String string = inp.nextLine();
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)\\s((USD)|(EUR)|(RUB))");
        Matcher matcher = pattern.matcher(string);
        ArrayList<String> ans = new ArrayList<>();
        while(matcher.find())
        {
            ans.add(matcher.group());
        }
        System.out.println(ans);
    }
}
