package practise6__6_7_8_9;

public class Magazine implements Printable{
    String magazineName;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public void Print() {
        System.out.printf("Magazine : %s \n",magazineName);
    }
}
