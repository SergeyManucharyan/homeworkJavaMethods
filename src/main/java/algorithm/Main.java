package algorithm;

import java.util.Arrays;

public class Main {
    static int t=1;
    public static void main(String[] args) {
        int [] array = {12,1,10,50,5,15,45};
        new MargeSort().mergeSort(array,array.length);
        int[] a={9,-89,23,65,4,7,51};
        new QuickSort().quickSort(a,0,a.length-1);
        int[] ar={9,-89,23,6,4,7,51};
        new HeapSort().heapSort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(new BubbleSort().bubbleSort(new int[]{6,7,0,9,-5,12,1})));
        System.out.println(Arrays.toString(new SelectionSort().selectionSort(new int[]{6,7,0,9,-5,12,1})));
        System.out.println(Arrays.toString(new InsertionSort().insertionSort(new int[]{6,7,0,9,-5,12,1})));
    }
}
