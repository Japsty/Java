package Task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner inp = new Scanner(System.in);
        String string = inp.nextLine();
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_]{8,}");
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
