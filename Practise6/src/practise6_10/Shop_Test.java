package practise6_10;

public class Shop_Test {
    public static void main(String[] args) {
        Shop s = new Shop();
        s.addComputer();
        s.addComputer();
        s.printComputers();

        s.findComputer();
        s.removeComputer();
        s.printComputers();
    }
}
