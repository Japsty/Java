package pract4_4;

public class pract4_4 {
    static class Computer {
        public static class Processor {
            enum processorBrand {
                Intel,
                AMD;
            }
            private double Hz;
            private double voltage;
            private int coresAmount;
            public Processor(){
                Hz = 4.5;
                voltage = 1.25;
                coresAmount = 12;
            }
            public Processor(double hz, double v,int cores){
                Hz = hz;
                voltage = v;
                coresAmount = cores;
            }

            public double getHz() {
                return Hz;
            }
            public double getVoltage() {
                return voltage;
            }
            public void setVoltage(double voltage) {
                this.voltage = voltage;
            }
            public void setHz(double hz) {
                Hz = hz;
            }
        }

        public static class Memory {
            enum memoryBrand {
                Crucial,
                HyperX,
                Kingston;
            }
            private int memorySize;
            private int memoryRank;
            private int memoryFreq;
            private double memoryVoltage;
            public double getMemoryVoltage() {
                return memoryVoltage;
            }
            public int getMemoryFreq() {
                return memoryFreq;
            }
            public int getMemoryRank() {
                return memoryRank;
            }
            public int getMemorySize() {
                return memorySize;
            }

            public void setMemoryFreq(int memoryFreq) {
                this.memoryFreq = memoryFreq;
            }

            public void setMemoryVoltage(double memoryVoltage) {
                this.memoryVoltage = memoryVoltage;
            }
        }

        public static class Monitor {
            enum monitorBrand {
                LG,
                Asus,
                AOC,
                Huawei;
            }
            private int width;//in pixels
            private int height;//in pixels
            private int diagonal;
            public Monitor()
            {
                width = 2560;
                height=1440;
                diagonal = 32;
            };
            public Monitor(int w,int h,int d)
            {
                width = w;
                height= h;
                diagonal = d;
            };
            public int getDiagonal() {
                return diagonal;
            };
            public int getHeight() {
                return height;
            };
            public int getWidth() {
                return width;
            };
            public double pixelDensity()
            {
                return((Math.sqrt((width*width)+(height*height)))/diagonal);
            };
        }
        public Processor CPU;
        public Memory memory;
        public Monitor monitor;
        public Computer(){
            CPU = new Processor();
            memory = new Memory();
            monitor = new Monitor();
        }
        //Собери его сам!
        public Computer(double cpu_f, double cpu_v,int cores, int m_width, int m_height, int m_size) {
            CPU = new Processor(cpu_f, cpu_v,cores);
            memory = new Memory();
            monitor = new Monitor(m_width, m_height, m_size);
        }
    }
}
