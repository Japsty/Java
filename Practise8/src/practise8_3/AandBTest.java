package practise8_3;
import java.util.Scanner;

public class AandBTest {
    public static void main(String[] args) {
        AandB test = new AandB();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int numbA = in.nextInt();
        int numbB = in.nextInt();
        test.Output(numbA,numbB);
    }
}
