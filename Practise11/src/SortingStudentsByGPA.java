import java.util.Comparator;
import java.util.Random;

public class SortingStudentsByGPA implements Comparator {
    public Student[] iDnumber;
    public int size;
    public Student[] first;
    public Student[] second;

    public void setArray(int n)
    {
        size = n;
        iDnumber = new Student[n];
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            int kurs = (int) (r.nextInt(4)+1);
            String group = "IKBO-33-21";
            String specialization = "Software engineer";
            String name = " ";
            for (int j = 0; j < 7; j++) {
                name += (char) (r.nextInt('z' - 'a') + 'a');
            }
            String surname = " ";
            for (int j = 0; j < 10; j++) {
                surname += (char) (r.nextInt('z' - 'a') + 'a');
            }
            double gpa = (r.nextDouble(10 - 1) + 1);

            iDnumber[i] = new Student(kurs, group, name, surname, specialization, gpa);
        }
    }
    public void outArray()
    {
        for(int i = 0;i< iDnumber.length;i++)
        {
            System.out.println(iDnumber[i].toString());
        }
    }

    // for GPA---------------------------------------------------
    public void qsort(Student[] arr, int start, int end) {
        if (start < end)
        {
            int pivotIndex = partition(arr, start, end);
            qsort(arr, start, pivotIndex - 1);
            qsort(arr, pivotIndex + 1, end);
        }
    }
    void swap(Student arr[],int i,int j) {
        Student temporary = arr[i];
        arr[i]=arr[j];
        arr[j]=temporary;
    }
    public int partition(Student[] arr, int start, int end) {
        int i = (start - 1);
        for (int j = start; j < end; j++)
        {
            if (arr[j].getGPA() > arr[end].getGPA())
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return (i + 1);
    }
    //-------------------------------------------------------------
    public void qsortKurs(Student[] arr, int start, int end) {
        if (start < end)
        {
            int pivotIndex = partitionKurs(arr, start, end);
            qsort(arr, start, pivotIndex - 1);
            qsort(arr, pivotIndex + 1, end);
        }
    }
    public int partitionKurs(Student[] arr, int start, int end) {
        int i = (start - 1);
        for (int j = start; j < end; j++)
        {
            if (arr[j].getKurs() > arr[end].getKurs())
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return (i + 1);
    }
    //-------------------------------------------------------------
    public static void mergeSort(Student[]a, int n) {
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
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].GPA >= r[j].GPA) {
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
    public static Student[] SortedMerge;

    //-----------------------------------------------------------------

    public  void mergeAndSort(Student[] first, Student[] second) {

        int n = first.length + second.length;
        //SortedMerge = new Student[n];
        for(int i = 0; i< n;i++)
        {
            if(i< first.length)
            {
                //SortedMerge[i] = first[i];
                iDnumber[i] = first[i];
            }
            if(i>= first.length && i< n)
            {
                //SortedMerge[i] = second[i- first.length];
                iDnumber[i] = second[i-5];
            }
        }
    }
    public static void OutMergedAndSorted()
    {
        for(int i = 0;i< SortedMerge.length;i++)
        {
            System.out.println(SortedMerge[i].toString());
        }
    }


    //----------------MAIN---------------------------------------------------
    public static void main(String[] args) {
        SortingStudentsByGPA Stu = new SortingStudentsByGPA();
        Stu.setArray(10);
        System.out.println("\nArray before  quicksorting: ");
        Stu.outArray();
        Stu.qsort(Stu.iDnumber,0, Stu.size-1 );
        System.out.println("\nArray after quicksorting: ");
        Stu.outArray();
        Stu.setArray(16);
        System.out.println("\nArray before  mergesort: ");
        Stu.outArray();
        Stu.mergeSort(Stu.iDnumber, Stu.size);
        System.out.println("\nArray after mergesort: ");
        Stu.outArray();
        System.out.println("\nArray after  quicksorting by course: ");
        Stu.setArray(5);
        Stu.qsortKurs(Stu.iDnumber,0, Stu.size-1);
        Stu.outArray();

        Stu.setArray(10);

        System.out.println("\nArray after merging:");


    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}