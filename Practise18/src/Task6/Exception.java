package Task6;

public class Exception {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            return "data for " + key;
        }
        catch (NullPointerException e)
        {
            return "null key in getDetails";
        }
    }
}
