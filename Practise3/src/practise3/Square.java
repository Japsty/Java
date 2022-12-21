package practise3;

public class Square extends Rectangle{
    public Square()
    {
    }
    public Square(double side)
    {
        this.width = side;
        this.lenght = side;
    }
    public Square(double side,String color,boolean filled)
    {
        this.width = side;
        this.lenght = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.lenght = side;
    }

    public void setWidth(double side) {
        this.width = side;
        this.lenght = side;
    }

    public void setLenght(double side) {
        this.width = side;
        this.lenght = side;
    }

    @Override
    public String toString() {
        return String.format("Shape: square, side:%s, color:%s",this.width,this.color);
    }
}
