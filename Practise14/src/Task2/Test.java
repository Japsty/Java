package Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Main string: abcdefghijklmnopqrstuv18340 ");
        System.out.println("Enter your string: ");
        Scanner inp = new Scanner(System.in);
        String string = inp.nextLine();
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(string);
        boolean bool = matcher.matches();
        System.out.printf("Is your string matches?: %b" , bool);
    }
}
