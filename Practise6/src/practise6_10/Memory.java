package practise6_10;

public class Memory {
    enum memoryBrand {
        Crucial,
        HyperX,
        Kingston;
    }
    private int memorySize;
    private int memoryRank;
    private int memoryFrequency;
    private double memoryVoltage;
    public double getMemoryVoltage() {
        return memoryVoltage;
    }
    public int getMemoryFreq() {
        return memoryFrequency;
    }
    public int getMemoryRank() {
        return memoryRank;
    }
    public int getMemorySize() {
        return memorySize;
    }
    public void setMemoryFreq(int memoryFreq) {
        this.memoryFrequency = memoryFrequency;
    }
    public void setMemoryVoltage(double memoryVoltage) {
        this.memoryVoltage = memoryVoltage;
    }
}
