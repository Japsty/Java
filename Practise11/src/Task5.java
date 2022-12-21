import java.util.Date;

public class Task5 {
    public static void main(String[] args)
    {
        SortingStudentsByGPA Stu = new SortingStudentsByGPA();
        Stu.setArray(1000000);
        long start = System.nanoTime();
        Stu.qsort(Stu.iDnumber,0, Stu.size-1 );
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Быстрая сортировка выполнилась за(в нс):"+elapsed);
        System.out.println("Сортировка слияниями выполнилась за(в мс):"+(elapsed/1000000));
        Stu.setArray(1000000);
        long start2 = System.nanoTime();
        Stu.mergeSort(Stu.iDnumber, Stu.size);
        long finish2 = System.nanoTime();
        long elapsed2 = finish - start;
        System.out.println("Сортировка слияниями выполнилась за(в нс):"+elapsed2);
        System.out.println("Сортировка слияниями выполнилась за(в мс):"+(elapsed2/1000000));

    }
}
