import java.util.Date;

public class Task1 {
    public static void main(String[] args)
    {
        int year = 2022;
        int month = 11;
        int day = 7;
        int hour = 13;
        int minute = 24;
        System.out.printf("Фамилия: Виноградов Год: %s Месяц: %s День: %s Час: %s Минут: %s\n",year,month,day,hour,minute);
        Date date = new Date();
        System.out.println("Дата сдачи: " + date);
    }
}