package algorithm;

public class HeapSort {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heap(arr, i, 0);
        }
    }

    void heap(int[] arr, int n, int i) {
        int large = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[large]) {
            large = l;
        }
        if (r < n && arr[r] > arr[large])
            large = r;
        if (large != i) {
            int swap = arr[i];
            arr[i] = arr[large];
            arr[large] = swap;
            heap(arr, n, large);
        }
    }
}
