import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        Date data = new Date(year-1900,month-1,day,hour,minute);
        System.out.println(data);
        System.out.printf("%d %d %d %d %d%n",calendar.get(calendar.YEAR),calendar.get(calendar.MONTH),calendar.get(calendar.DAY_OF_MONTH),calendar.get(calendar.HOUR_OF_DAY),calendar.get(calendar.MINUTE));
    }
}
