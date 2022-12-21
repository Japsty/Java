package Task2;

public class Test {
    public static void main(String[] args) {
        Person chel = new Person("Russkii");
        System.out.println(chel.toString());
        Person chel2 = new Person("Putin","Vova");
        System.out.println(chel2.toString());
        Person chel3 = new Person("Putin","Vova","Vladimirovich");
        System.out.println(chel3.toString());
    }
}
