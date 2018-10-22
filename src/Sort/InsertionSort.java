package Sort;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSortRecursive (int arr[], int n) {
        if (n <= 1)
            return;
        insertionSortRecursive(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        insertionSortRecursive(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
  /*  void sort (int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i)
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    static void printArray (int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main (String args[]) {
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
}
*/