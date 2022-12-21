package Task9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner inp = new Scanner(System.in);
        String string = inp.nextLine();
        Pattern pattern = Pattern.compile("((But)|(you)|(know)|(I)|(don't)|(mind)|(yeah)|(right))");
        Matcher matcher = pattern.matcher(string);
        ArrayList<String> answ = new ArrayList<>();
        while (matcher.find())
        {
            answ.add(matcher.group());
        }
        System.out.println(answ);
    }
}
