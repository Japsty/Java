package pract7_8;

public class main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[20];
        printables[0] = new Book("War and Piece");
        printables[1] = new Magazine("Forbes");
        printables[2] = new Book("Crime and Punishment");
        printables[3] = new Book("Brave new world");
        printables[4] = new Magazine("Cosmopolitan");
        printables[5] = new Book("Plato's state");
        printables[6] = new Magazine("Vogue");
        printables[7] = new Book("The Dawns Here Are Quiet");
        Book.printBooks(printables);
    }
}
