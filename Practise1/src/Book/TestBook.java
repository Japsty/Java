package Book;
import Book.Book;
import java.lang.*;
public class TestBook {
    public static void main(String[] args)
    {
        Book b1 = new Book();
        Book b2 = new Book(560, "Lord of rings");
        Book b3 = new Book("Day");
        System.out.println("Book name is " + b1.GetName()
                + " Amount of pages in book is " + b1.GetPages()
                + " Thikness of book is " + b1.CalculateThikness()) ;
        System.out.println("Book name is " + b2.GetName()
                        + " Amount of pages in book is " + b2.GetPages()
                        + " Thikness of book is " + b2.CalculateThikness());
        System.out.println("Book name is " + b3.GetName()
                        + " Amount of pages in book is " + b3.GetPages()
                        + " Thikness of book is " + b3.CalculateThikness());
    }
}
