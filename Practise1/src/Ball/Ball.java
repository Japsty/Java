package Ball;

import java.lang.*;
public class Ball {
    private int radius;
    private double pressure;
    private String color;
    public Ball()
    {
        this.radius = 22;
        this.color =" white";
        this.pressure = 1.1;
    }
    public Ball(int rad,String col)
    {
        this.radius = rad;
        this.pressure = 1.1;
        this.color = col;
    }
    public Ball(double pr,int rad)
    {
        this.pressure = pr;
        this.radius = rad;
        this.color = "red";
    }
    public double GetRadius()
    {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getPressure() {
        return pressure;
    }

    public double GetPressure()
    {
        return pressure;
    }
    public String GetColor()
    {
        return color;
    }
    public double BallVolume()
    {
        return radius*1.3333333*Math.PI;
    }

    public String toString() {
        return ("Ball radius is " + radius + " Ball color is "+ color + " Ball pressure is " +pressure);
    }
}



