package practise2.author;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author a1 = new Author("Ivan Ivanovich","ivivanovich@mail.ru",'M');
        System.out.println(a1.toString());
        a1.setEmail("ivaivanich@rambler.ru");
        System.out.println(a1.toString());
    }
}
