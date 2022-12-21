package practise6_4;

public class Good implements Priceable {
    private int price;
    private int mass;
    private String name;
    @Override
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }
    public int getMass() {
        return mass;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Good()
    {
        this.name = "";
        this.price = 0;
        this.mass = 0;
    }
    public Good(String n,int p,int m)
    {
        this.name = n;
        this.price = p;
        this.mass = m;
    }
    @Override
    public String toString() {
        return "Good{" +
                "price=" + price +
                ", mass=" + mass +
                ", name='" + name + '\'' +
                '}';
    }
}
