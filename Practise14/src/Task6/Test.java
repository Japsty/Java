package Task6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner inp = new Scanner(System.in);
        String string = inp.nextLine();
        Pattern pattern = Pattern.compile("\\w+@(([a-z]+.[a-z]{2,3})|([a-z]+))");
        Matcher matcher = pattern.matcher(string);
        boolean bool = matcher.matches();
        if(bool == true)
        {
            System.out.println("Your expression is right: ");
            System.out.println(string);
        }
        else {
            System.out.println("Your expression isn't right");
        }
    }
}
