package pract4_2;

public class pract4_2 {
    enum Size
    {
        XXS(32){
            public String getDescription() {return "Child size";}
        },
        XS(34){
            public String getDescription(){
                return "Women size";
            }
        },
        S(36) {
            public String getDescription() {return "Women size";}
        },
        M(38) {
            public String getDescription(){return "Men size";}
        },
        L(40){
            public String getDescription(){
                return "Men size";
            }
        };
        private final int euroSize;
        Size(int euroSize)
        {
        this.euroSize = euroSize;
        }
        public int getEuroSize() {
            return this.euroSize;
        }
    }
    interface MenClothing
    {
        void dressMan( Clothes[] clothes);
    }
    interface WomenClothing
    {
        void dressWomen(Clothes[] clothes);
    }
    static abstract public class Clothes
    {
        protected int clothesSize;
        protected int clothesCost;
        protected String clothesColor;
        public Clothes(){}
        public Clothes(int size, int cost, String color) {
            clothesSize = size;
            clothesCost = cost;
            clothesColor = color;
        }

        public Clothes(int cost, String color) {
            clothesCost = cost;
            clothesColor = color;
        };

        public abstract String getType();
        public abstract String toString();
    }
    static public class TShirt extends Clothes implements MenClothing,WomenClothing
    {
        public TShirt(int size, int cost, String color){
            this.clothesSize = size;
            this.clothesCost = cost;
            this.clothesColor = color;
        }
        public String getType(){
            return "Tshirt";
        }
        public void dressMan(Clothes[] clothes) {

        }
        public void dressWomen(Clothes[] clothes) {

        }
        public String toString() {
            return String.format("%s: %d, %s — %d", this.getType(), this.clothesSize, this.clothesColor, this.clothesCost);
        }
    }
    static class Pants extends Clothes implements MenClothing,WomenClothing
    {
        public Pants(int size, int cost, String color) {
            clothesSize = size;
            clothesCost = cost;
            clothesColor = color;
        }
        public void dressMan(Clothes[] clothes) {

        }
        public void dressWomen(Clothes[] clothes) {

        }
        public String getType(){
            return "Pants";
        }
        public String toString() {
            return String.format("%s: %d, %s — %d", this.getType(), this.clothesSize, this.clothesColor, this.clothesCost);
        }
    }
    static class Skirt extends Clothes implements WomenClothing
    {
        public Skirt(int size, int cost, String color){
            this.clothesSize = size;
            this.clothesCost = cost;
            this.clothesColor = color;
        }
        public void dressWomen(Clothes[] clothes){

        }
        public String getType(){
            return "Skirt";
        }

        public String toString() {
            return String.format("%s: %d, %s — %d", this.getType(), this.clothesSize, this.clothesColor, this.clothesCost);
        }
    }
    static class Tie extends Clothes implements MenClothing
    {
        public Tie(int cost, String color){
            this.clothesCost = cost;
            this.clothesColor = color;
        }
        @Override
        public void dressMan(Clothes[] clothes){
        }
        public String getType(){
            return "Tie";
        }

        public String toString() {
            return String.format("%s: %d, %s — %d", this.getType(), this.clothesSize, this.clothesColor, this.clothesCost);
        }
    }
    static class Atelier implements MenClothing, WomenClothing
    {
        public void dressMan(Clothes[] clothes) {
            System.out.println("Suitable for men:");
            for (Clothes c : clothes) {
                if (c instanceof MenClothing) {
                    System.out.println(c.toString());
                }
            }
        }

        public void dressWomen(Clothes[] clothes) {
            System.out.println("Suitable for women:");
            for (Clothes c : clothes) {
                if (c instanceof WomenClothing) {
                    System.out.println(c.toString());
                }
            }
        }
    }
    public static void main(String[] args) {
        TShirt tshirt = new TShirt(Size.XXS.getEuroSize(),3500,"white");
        Pants pants = new Pants(Size.XS.getEuroSize(),7000,"Beige");
        Skirt skirt = new Skirt(Size.M.getEuroSize(),4000,"Black");
        Tie tie = new Tie(2500,"Blue");
        Atelier atelier = new Atelier();

        Clothes[] clothes = {tshirt, pants, skirt, tie};
        atelier.dressMan(clothes);
        atelier.dressWomen(clothes);
    }
}

