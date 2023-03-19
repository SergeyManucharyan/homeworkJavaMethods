import algorithm.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {
    BubbleSort bs = new BubbleSort();
    @Test
    void bubbleSortTest(){
        int[]arr={5,7,-8,9,12,0,56};
        int[]arr1={5,7,-8,9,12,0,56};
        BubbleSort bs=new BubbleSort();
        Arrays.sort(arr1);
        bs.bubbleSort(arr);
        assertArrayEquals(arr1, arr);
    }
    @Test
    void insertionSortTest(){
        int[]arr={5,7,-8,9,12,0,56};
        int[]arr1={5,7,-8,9,12,0,56};
        Arrays.sort(arr1);
        new InsertionSort().insertionSort(arr);
        assertArrayEquals(arr1, arr);
    }
    @Test
    void mergeSortTest(){
        int[]arr={5,7,-8,9,12,0,56};
        int[]arr1={5,7,-8,9,12,0,56};
        Arrays.sort(arr1);
        new MargeSort().mergeSort(arr,arr.length);
        assertArrayEquals(arr1, arr);
    }
    @Test
    void quickSortTest(){
        int[]arr={5,7,-8,9,12,0,56};
        int[]arr1={5,7,-8,9,12,0,56};
        Arrays.sort(arr1);
        new QuickSort().quickSort(arr,0,arr.length-1);
        assertArrayEquals(arr1, arr);
    }
    @Test
    void heapSortTest(){
        int[]arr={5,7,-8,9,12,0,56};
        int[]arr1={5,7,-8,9,12,0,56};
        Arrays.sort(arr1);
        new HeapSort().heapSort(arr);
        assertArrayEquals(arr1, arr);
    }
}
