package practise6_5;

public class MovablePoint implements Movable {
    int x;
    int y;
    public MovablePoint(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}' ;
    }

    @Override
    public void moveUp( int moveY) {
        this.y = this.y + moveY;
        System.out.printf("The point moved up to: %d \n",this.y);
    }

    @Override
    public void moveDown(int moveY) {
        this.y = this.y - moveY;
        System.out.printf("The point moved down to: %d \n",this.y);
    }

    @Override
    public void moveLeft(int moveX) {
        this.x = this.x - moveX;
        System.out.printf("The point moved left to: %d \n",this.x);
    }

    @Override
    public void moveRight(int moveX) {
        this.x = this.x + moveX;
        System.out.printf("The point moved rigth to: %d \n",this.x);
    }
}
