import java.util.Random;

public class SortingStidentsByGPA implements Comparator {
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
            if (arr[j].getGpa() > arr[end].getGpa())
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        //swap(&array[i + 1], &array[upper]);//finally, swapping the pivot and the element in the position at which pivot is supposed to be
        return (i + 1);
    }
}
