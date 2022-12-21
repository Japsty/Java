package Task3;

import java.util.StringTokenizer;

public class Adress {
    private String country = "";
    private String region = "";
    private String town = "";
    private String street = "";
    private String house = "";
    private String building = "";
    private String flat = "";

    public Adress()
    {}
    private String separator(String string)
    {
        StringTokenizer st = new StringTokenizer(string);
        while(st.hasMoreTokens())
        {
            if(country == ""){
                String buff = st.nextToken();
                String buff2=buff.substring(0,buff.length()-1);
                this.country = buff2;
            }
            else if (region == "") {
                String buff = st.nextToken();
                String buff2=buff.substring(0,buff.length()-1);
                this.region = buff2;
            }
            else if (town == "") {
                String buff = st.nextToken();
                String buff2=buff.substring(0,buff.length()-1);
                this.town = buff2;
            }
            else if (street == "") {
                String buff = st.nextToken();
                String buff2=buff.substring(0,buff.length()-1);
                this.street = buff2;}
            else if (house == "") {
                String buff = st.nextToken();
                String buff2=buff.substring(0,buff.length()-1);
                this.house = buff2;}
            else if (building == "") {
                String buff = st.nextToken();
                String buff2=buff.substring(0,buff.length()-1);
                this.building = buff2;}
            else if (flat == ""){this.flat = st.nextToken();}
            else {return "Error";}
        }
        return "";
    }
    public void setAdress(String string)
    {
        separator(string);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
