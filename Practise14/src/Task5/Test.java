package Task5;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static boolean Vis(String string)
    {
        boolean res = false;
        StringTokenizer token = new StringTokenizer(string,"/");
        int[] date = new int[3];

        for(int i = 0;i<3;i++)
        {
            date[i] = Integer.parseInt(token.nextToken());
        }
        if(date[1] == 2)
        {
            if(date[0]<=29 && date[2]%4==0){res = true;}
            else if(date[0]<29)
            {
                res = true;
            }
            else {
                res = false;
            }
        }
        else
            res = true;

        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner inp = new Scanner(System.in);
        String string = inp.nextLine();
        Pattern pattern = Pattern.compile("(((0[1-9]|[1-2][0-9]|(3[0-1]))/((0[1-9])|(1[0-2]))/((19)|([2-9][0-9]))[0-9][0-9]\\D*)+)");
        //Pattern visoc = Pattern.compile()

        Matcher matcher = pattern.matcher(string);
        boolean bool = matcher.matches();
        if(bool == true && Vis(string) == true)
        {
            System.out.println("Your expression is right: ");
            System.out.println(string);
        }
        else {
            System.out.println("Your expression isn't right");
        }
    }
}
