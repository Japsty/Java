package practise6_10;

import java.util.Scanner;

public class Computer {
    public String Name;
    public int Price;
    public Processor Cpu;
    public Memory Memory;
    public Monitor Monitor;

    public Computer(){
        Cpu = new Processor();
        Memory = new Memory();
        Monitor = new Monitor();
        setName();
        setPrice();
        setFreq();
        setWidthAndHeight();
    }

    public void setName(){
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        Name= s.nextLine();
    }

    public void setPrice(){
        Scanner s = new Scanner(System.in);
        System.out.print("Price: ");
        Price = s.nextInt();
    }

    public void setFreq() {
        Scanner s = new Scanner(System.in);
        System.out.print("Frequency: ");
        Cpu.setFreq(s.nextDouble());
    }

    public void setWidthAndHeight(){
        Scanner s = new Scanner(System.in);
        System.out.print("Width and Height: ");
        Monitor.setWidth(s.nextInt());
        Monitor.setHeight(s.nextInt());
    }

    public Computer(String Name, int price, double cpu_f, double cpu_v, int m_width, int m_height, int m_size) {
        Cpu = new Processor(cpu_f, cpu_v);
        Memory = new Memory();
        Monitor = new Monitor(m_width, m_height, m_size);
         Name= Name;
        price = price;
    }

    public void printComp(){
        System.out.println(String.format("%s, %d rubles,%f gHz, %d pixels", Name, Price, Cpu.getFreq(), Monitor.getResolution()));
    }
}
