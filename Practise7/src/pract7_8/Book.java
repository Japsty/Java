package pract7_8;

public class Book implements Printable{
    String bookName;
    public Book(String Name){
        bookName = Name;
    }
    public void print(){
        System.out.println(bookName);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Book)
                p.print();
        }
    }
}
