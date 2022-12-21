package practise8_2;

import java.util.Scanner;

public class NNTest {
    public static void main(String[] args) {
        NaturalNumber n = new NaturalNumber();
        System.out.println("Enter your number: ");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        n.NumberOut(numb);
    }
}
