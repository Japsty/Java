package Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner inp = new Scanner(System.in);
        String string = inp.nextLine();
        Pattern pattern = Pattern.compile(",");
        String[] buff = pattern.split(string);
        for(int i = 0;i <buff.length;i++)
        {
            System.out.println(buff[i]);
        }
    }
}
