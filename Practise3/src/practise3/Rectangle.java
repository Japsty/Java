package practise3;
public class Rectangle extends Shape {
    protected double width;
    protected double lenght;


    public Rectangle(double width,double length,String color,boolean filled)
    {
        this.width=width;
        this.lenght=length;
        this.color = color;
        this.filled = filled;
    }
    public Rectangle()
    {

    }
    public Rectangle(double width,double length)
    {
        this.width=width;
        this.lenght=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return (lenght*width);
    }
    public double getPerimeter() {
        return((lenght*2)+(width*2));
    }

    @Override
    public String toString() {
        return String.format("Shape:Rectangle, width:%s, lenght:%s",this.width,this.lenght);
    }
}
