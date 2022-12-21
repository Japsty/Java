package Task4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner inp = new Scanner(System.in);
        String string = inp.nextLine();
        Pattern pattern = Pattern.compile("\\w?\\s*\\d+\\s*\\+\\s*\\d+\\s*\\w?");
        Matcher matcher = pattern.matcher(string);
        boolean bool = false;
        if(matcher.find())
        {
            bool = true;
        }
        if(bool == true)
        {
            System.out.println("There is + in your expression");
        }
        else {
            System.out.println("There is no + in your expression");
        }
    }
}
