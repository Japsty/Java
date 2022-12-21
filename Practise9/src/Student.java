public class Student implements Comparable {
    private int idNumber;
    private String name;
    private double gpa;

    public Student(int idNumber, String name, double gpa){
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIdNumber(){
        return this.idNumber;
    }

    public String getName(){
        return this.name;
    }

    public double getGpa(){
        return this.gpa;
    }
    public void setGpa(double val) {
        this.gpa = val;
    }

    public int compareTo(Student obj) {
        String s1 = this.getName();
        String s2 = obj.getName();
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if ((int) s1.charAt(i) == (int) s2.charAt(i)) {
                continue;
            } else {
                return s1.charAt(i) < s2.charAt(i) ? 1 : 0;
            }
        }
        return -1;
    }
}
