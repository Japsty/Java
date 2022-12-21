import java.util.Random;

public class StudentListCreation {

    public Student[] students;
    public int[] idNumber;
    public int size;

    public StudentListCreation(int n) {
        size = n;
        students = new Student[n];
        idNumber = new int[n];
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            int kurs = (int) (r.nextInt(5));
            String group = "IKBO-33-21";
            String name = " ";
            for (int j = 0; j < 7; j++) {
                name += (char) (r.nextInt('z' - 'a') + 'a');
            }
            String surname = " ";
            for (int j = 0; j < 10; j++) {
                surname += (char) (r.nextInt('z' - 'a') + 'a');
            }
            String specialization = "Software engineer";
            double gpa = (r.nextDouble(10 - 1) + 1);

            students[i] = new Student(kurs, group, name, surname, specialization, gpa);
        }
    }
}
