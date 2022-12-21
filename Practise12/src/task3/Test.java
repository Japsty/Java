package task3;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Test extends JFrame{
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Test(){
        setSize(464,784);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(image, 0, 0, 464, 784, null);
    }


    public static void main(String[] args) {

        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_00_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_01_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_02_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_03_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_04_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_05_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_06_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_07_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_08_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_09_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_10_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_11_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_12_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_13_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_14_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_15_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_16_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_17_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_18_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_19_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_20_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_21_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_22_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_23_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_24_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_25_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_26_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_27_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_28_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_29_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_30_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_31_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_32_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_33_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_34_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_35_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_36_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_37_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_38_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_39_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_40_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_41_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_42_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_43_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_44_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_45_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_46_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_47_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_48_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_49_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_50_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_51_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_52_delay-0.04s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_53_delay-0.03s.gif").getImage());
        framlist.add(new ImageIcon("/Users/danilvinogradov/Desktop/ВУЗ/Java/Practise12/src/task3/kot/frame_54_delay-0.03s.gif").getImage());

        Test test = new Test();
        while (true) {
            for (int i = 0; i < 54; i++)
            {
                image = framlist.get(i);
                test.drawIcon();
                try
                {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
