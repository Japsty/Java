import java.util.Calendar;
import java.util.Scanner;

public class Task3 extends Student {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println("0 - обычный формат, 1 - расширенный формат");
        int x = scanner.nextInt();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String A = "";
        switch (x)
        {
            case 1:
            {
                A+=year+"/"+month+"/"+day+"\n";
            }
            case 0:
            {
                A+=hour+":"+minute+":"+second+"\n";
            }
            default:{}
        }
        System.out.println(A);
    }

}
