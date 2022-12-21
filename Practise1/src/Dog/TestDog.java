package Dog;
import Dog.Dog;
import java.lang.*;
public class TestDog {
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Richard", 4);
        Dog d2 = new Dog("Itty", 2);
        Dog d3 = new Dog("Nik");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
