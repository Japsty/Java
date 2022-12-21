package pract4_1;

public class pract4 {

    enum Season {
        winter(-10),
        spring(15),
        summer(30){
            public String getDescription()
            {
                return "Warm season";
            }
        },
        fall(10);
        private final int temperature;
        Season(int temperature) {
            this.temperature = temperature;
        }
        public String getDescription()
        {
            return "Cold season";
        }
        public int getTemperature()
        {
            return temperature;
        }
    };
    public static void main(String[] args) {
        Season time;
        time = Season.summer;
        switch (time) {
            case summer: System.out.println("I like summer \n");break;
            case spring: System.out.println("I like spring \n");break;
            case fall: System.out.println("I like fall \n");break;
            case winter: System.out.printf("I like winter \n");break;

        }
        for (Season s : Season.values()) {
            System.out.printf("%s: %s - %d Celsius\n",s,s.getDescription(), s.getTemperature());
        }
    }
}
