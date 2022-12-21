package Task1;

public class Exception {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Поделил на ноль?");
        }
    }
}