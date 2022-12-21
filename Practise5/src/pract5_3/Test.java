package task2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Test extends JFrame {
    private int width = 1200;
    private int height = 680;

    private Image img;

    public Test() {
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void loadImage(String src) {
        img = new ImageIcon(src).getImage();
    }
    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(img, 0, 0, width, height, null);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.loadImage("C:\\Users\\Danil\\Desktop\\Учеба\\2 КУРС\\ДЖАВА\\Решенная джава\\Practise12\\src\\task2\\rally2.jpg");
        test.drawIcon();
    }
}
