package task1;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public Test()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(2560,1440);
        setVisible(true);
    }

    public static Shape toRandomizeShape()
    {
        int rand = (int)(Math.random() * 3);
        if (rand == 0)
            return new Rectangle();
        else if (rand == 1)
            return new Circle();
        else
            return new Square();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        int x=13;
        for (int i = 0; i < 15; ++i, x += 170) {
            int y = 33;
            for (int j = 0; j < 10; ++j, y += 140) {
                // Случайный цвет
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);

                // Случайная фигура
                Shape sh = toRandomizeShape();
                sh.setXY(x, y);
                sh.setColor(new Color(red, green, blue));

                // Отрисовка
                g.setColor(sh.getColor());
                if (sh.getClass().getSimpleName().equals("Square"))
                    g.fillRect(sh.getX(), sh.getY(), 100, 100);
                else if (sh.getClass().getSimpleName().equals("Rectangle"))
                    g.fillRect(sh.getX(), sh.getY(), 100, 60);
                else if (sh.getClass().getSimpleName().equals("Circle"))
                    g.fillOval(sh.getX(), sh.getY(), 100, 100);
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                Test tw = new Test();
            }
        });
    }
}
