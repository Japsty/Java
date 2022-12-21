package pract7_5_6;

public class Strings_ implements Strings{
    private String string;

    public Strings_ (String string)
    {
        this.string = string;
    }

    public int SignsCount() {
        return this.string.length();
    }
    public String NewString() {
        String result = "";
        for ( int i = 0; i<this.SignsCount();i+=3){
            result += string.charAt(i);
        }
        return result;
    }
    public String InvertString() {
        String result = "";
        for(int i = this.SignsCount()-1;i>=0;i-- )
        {
            result += string.charAt(i);
        }
        return result;
    }
}
