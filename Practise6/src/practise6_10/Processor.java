package practise6_10;

public class Processor {
    private double frequency;
    private double voltage;

    public Processor(double f, double v){
        frequency = f;
        voltage = v;
    }

    public Processor(){
        frequency = 4.5;
        voltage = 0.5;
    }

    public void undervolt(double n) {
        if (this.voltage - n > 0) {
            this.voltage -= n;
        }
    }

    public void uppervolt(double n) {
        this.voltage += n;
    }

    public double getFreq(){
        return this.frequency;
    }

    public double getVoltage(){
        return this.voltage;
    }

    public void setFreq(double frequency) {
        this.frequency = frequency;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
}
