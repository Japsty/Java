package pract7_5_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        Strings_ string = new Strings_(input);
        System.out.println(string.SignsCount());
        System.out.println(string.NewString());
        System.out.println(string.InvertString());
    }
}
