package Task2;

public class Person {
    private String SecondName;
    private String FirstName="empty";
    private String LastName="empty";

    public Person(String SecondName)
    {
        this.SecondName = SecondName;
    }
    public Person(String SecondName,String FirstName)
    {
        this.SecondName = SecondName;
        this.FirstName = FirstName;
    }
    public Person(String SecondName,String FirstName,String LastName)
    {
        this.SecondName = SecondName;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String toString() {
        return "Person{" +
                "SecondName='" + SecondName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
