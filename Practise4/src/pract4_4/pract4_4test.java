package pract4_4;

public class pract4_4test {
    public static void main(String[] args) {
        pract4_4.Computer comp = new pract4_4.Computer(4400,1.25,20,1920,1080,22);
        System.out.println("CPU Frequency is:"+comp.CPU.getHz());
        comp.CPU.setVoltage(1.27);
        System.out.println("CPU voltage is:"+comp.CPU.getVoltage());
        comp.memory.setMemoryFreq(4000);
        comp.memory.setMemoryVoltage(1.25);
        System.out.println("Memory Frequency is:" + comp.memory.getMemoryFreq());
        System.out.println("Memory Voltage is:"+comp.memory.getMemoryVoltage());
        System.out.println("Monitor PPI is:"+comp.monitor.pixelDensity());
    }
}
