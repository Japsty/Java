package practise6_10;

import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    HashMap<String, Computer> computers = new HashMap<>();

    public void addComputer() {
        Computer c = new Computer();
        computers.put(c.Name, c);
    }
    public void removeComputer() {
        Scanner s = new Scanner(System.in);
        System.out.print("Input name to remove: ");
        String name = s.nextLine();
        computers.remove(name);
    }

    public void printComputers(){
        for (Computer v: computers.values()){
            v.printComp();
        }
    }

    public void findComputer(){
        Scanner s = new Scanner(System.in);
        System.out.print("Input name to find: ");
        String name = s.nextLine();
        Computer result = computers.get(name);
        if (result != null) {
            System.out.println(computers.get(name).Name);
        } else {
            System.out.println("Computer was not found");
        }
    }
}

