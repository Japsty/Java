package pract7_8;

public class Magazine implements Printable{
    String mag_name;
    public Magazine(String name){
        mag_name = name;
    }

    public void print(){
        System.out.println(mag_name);
    }
}
