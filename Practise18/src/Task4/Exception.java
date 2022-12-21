package Task4;

import java.util.Scanner;

public class Exception {
    public void exceptionDemo()
    {
        String intString = "";
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Неверный ввод");
        }
        finally {
            System.out.printf("Программа завершилась");
        }
    }
}