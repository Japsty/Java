package Book;
import java.lang.*;
public class Book
{
    private int pages;
    private String name;
    public Book()
    {
        pages = 1300;
        name = "The Witcher";
    }
    public Book(int pg,String nm) {
        pages = pg;
        name = nm;
    }
    public Book(String nm)
    {
        pages = 450;
        name = nm;
    }
    public int SetPages(int pg)
    {
        pages = pg;
        return pages;
    }
    public String SetName(String nm)
    {
        name = nm;
        return name;
    }
    public int GetPages()
    {
        return pages;
    }
    public String GetName()
    {
        return name;
    }
    public double CalculateThikness()
    {
        return pages*0.001;
    }
}



