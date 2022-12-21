package Task1;


public class Test {
    public static void main(String[] args) {
        Task1 task = new Task1("I like Java!!!");
        System.out.println(task.getString());

        System.out.println(task.getString().charAt(task.LastIndex()));

        System.out.println(task.getString().endsWith("!!!"));

        System.out.println(task.getString().startsWith("I like"));

        System.out.println(task.getString().contains("Java"));

        System.out.println(task.getString().indexOf("Java"));

        task.setString(task.getString().replace("a","o"));
        System.out.println(task.getString());

        task.setString(task.getString().toUpperCase());
        System.out.println(task.getString());

        task.setString(task.getString().toLowerCase());
        System.out.println(task.getString());

        task.setString("I like Java!!!");
        String java = "Java";
        Task1 task2 = new Task1(task.getString().substring(task.getString().indexOf("Java"),task.getString().indexOf("Java")+java.length()));
        System.out.println(task2.getString());


    }
}
