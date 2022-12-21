package practise6_5;

public class Main {
    public static void main(String[] args) {
        MovablePoint Point = new MovablePoint(0,10);
        Point.moveUp(20);
        Point.moveDown(11);
        Point.moveLeft(9);
        Point.moveRight(23);

        System.out.printf("\n");

        MovableCircle Circle = new MovableCircle(10,20,5);
        Circle.moveUp(-10);
        Circle.moveDown(-2);
        Circle.moveLeft(1);
        Circle.moveRight(15);

    }
}
