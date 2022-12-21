import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class StudentListCreator{
    public Student[] students;
    public int[] idNumbers;
    private final DecimalFormat df = new DecimalFormat("0.00");
    public int size;


    public StudentListCreator(int n) {
        size = n;
        students = new Student[n];
        idNumbers = new int[n];
        for (int i = 0; i < size; i++){
            Random r = new Random();
            int id  = (int) (r.nextInt(99999 - 10000) + 10000);
            double gpa = (r.nextDouble(10 - 1) + 1);
            String name = " ";
            for (int j = 0; j < 7; j++){
                name += (char) (r.nextInt('z' - 'a') + 'a');
            }
            students[i] = new Student(id, name, gpa);
            idNumbers[i] = id;
        }
    }

    public void printIds(){
        for (int i = 0; i < size; i++){
            System.out.print(df.format(idNumbers[i]) + " ");
        }
        System.out.println();
    }

    public void printGPAs() {
        for (int i = 0; i < size; i++){
            System.out.print(df.format(students[i].getGpa()) + " ");
        }
        System.out.println();
    }

    public void printNames() {
        for (int i = 0; i < size; i++){
            System.out.print(students[i].getName() + " ");
        }
        System.out.println();
    }

    public void insertionSort(int[] arr) {
        for (int i = 1; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public Student[] mergeArrays(Student[] stds){
        int fal = this.students.length;
        int sal = stds.length;
        Student[] result = new Student[fal + sal];
        System.arraycopy(this.students, 0, result, 0, fal);
        System.arraycopy(stds, 0, result, fal, sal);
        return result;
    }

    public void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) == 1 || l[i].compareTo(r[j]) == -1) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
