package practise3;
public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public Circle(double radius) {
        this.radius = radius;
        this.filled = false;
        this.color = "black";
    }
    public Circle() {
        this.filled = false;
        this.color = "black";
        radius = 2;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return (Math.PI*radius)*(Math.PI*radius);
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return String.format("Shape:Circle,radius:%s",this.radius);
    }
}

