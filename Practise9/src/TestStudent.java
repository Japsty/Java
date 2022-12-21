import java.text.DecimalFormat;
import java.util.Random;

public class TestStudent {

    public static void main(String[] args) {
        StudentListCreator scr = new StudentListCreator(10);
        scr.printIds();
        scr.insertionSort(scr.idNumbers);
        scr.printIds();

        SortingStidentsByGPA qsort = new SortingStidentsByGPA();
        scr.printGPAs();
        qsort.qsort(scr.students, 0, scr.size - 1);
        scr.printGPAs();

        StudentListCreator scr2 = new StudentListCreator(10);
        scr.printNames();
        scr2.printNames();

        StudentListCreator scr_res = new StudentListCreator(20);
        scr_res.students = scr.mergeArrays(scr2.students);

        scr_res.printNames();
        scr_res.mergeSort(scr_res.students, scr_res.size);
        scr_res.printNames();
    }
}
