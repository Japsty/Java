import java.util.Random;

public class Student {
    String name;
    String surname;
    int kurs;
    String group;
    String specialization;
    double GPA;


    // Getters-----------------------------------------
    public String getGroup() {
        return this.group;
    }
    public int getKurs() {
        return this.kurs;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return  this.surname;
    }
    public String getSpecialization() {
        return this.specialization;
    }
    public double getGPA() {
        return this.GPA;
    }

    // Setters-----------------------------------------
    public void setGroup(String group) {
        this.group = group;
    }
    public void setKurs(int kurs) {
        this.kurs = kurs;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }

    Student()
    {
        setKurs(2);
        setGroup("IKBO-33-21");
        setName("Danil");
        setSurname("Vinogradov");
        setSpecialization("Soft Engineer");
        setGPA(4.5);
    }
    Student(int kurs,String group,String name,String surname,String specialization,double GPA)
    {
        setKurs(kurs);
        setGroup(group);
        setName(name);
        setSurname(surname);
        setSpecialization(specialization);
        setGPA(GPA);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", kurs=" + kurs +
                ", group='" + group + '\'' +
                ", specialization='" + specialization + '\'' +
                ", GPA=" + GPA +
                '}';
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
