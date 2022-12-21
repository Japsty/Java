package Task1;

public class Task1 {
    private String string;
    public Task1(String string)
    {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
    public int LastIndex()
    {
        return string.length()-1;
    }
}
