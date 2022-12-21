import java.util.Scanner;
import java.util.Calendar;

public class Task2 {
    public static void main(String[] args)
    {
        long system = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        Calendar mytime = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        int year1 = calendar.get(Calendar.YEAR);
        int month1 = calendar.get(Calendar.MONTH) + 1;
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);
        int minute1 = calendar.get(Calendar.MINUTE);
        int second1 = calendar.get(Calendar.SECOND);

        System.out.println("Введите год:");
        int year2 = scanner.nextInt();
        mytime.set(Calendar.YEAR,year2);
        System.out.println("Введите месяц:");
        int month2 = scanner.nextInt();
        mytime.set(Calendar.MONTH,month2);
        System.out.println("Введите день:");
        int day2 = scanner.nextInt();
        mytime.set(Calendar.DAY_OF_MONTH,day2);
        System.out.println("Введите час:");
        int hour2 = scanner.nextInt();
        mytime.set(Calendar.HOUR_OF_DAY,hour2);
        System.out.println("Введите минуту:");
        int minute2 = scanner.nextInt();
        mytime.set(Calendar.MINUTE,minute2);
        System.out.println("Введите секунду:");
        int second2 = scanner.nextInt();
        mytime.set(Calendar.SECOND,second2);

        if(system != mytime.getTimeInMillis() ){
            System.out.println("Ваше время расходится");
        }
        else
        {
            System.out.println("Ваше время сходится");
        }
        if (system != calendar.getTimeInMillis()) {
            System.out.println("Время календаря расходится");
        }
        else
        {
            System.out.println("Время календаря сходится");
        }

    }
}