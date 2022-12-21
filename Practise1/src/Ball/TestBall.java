package Ball;

public class TestBall
{
    public static void main(String[] args) {
        Ball b1 = new Ball();

        System.out.println(b1.toString());

        Ball b2 = new Ball(21, "red");

        System.out.println(b2.toString());

        Ball b3 = new Ball(0.9, 23);
        System.out.println(b3.toString());
    }
}
