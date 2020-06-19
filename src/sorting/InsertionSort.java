package sorting;

import java.util.Arrays;

/**
 * @author: pN-junction
 * @date: Sep 17, 2016 6:41:22 PM
 * @description: program to demonstrate Insertion Sort algorithm
 * @timeComplexity: O(n2)
 * @spaceComplexity: O(1)
 */
public class InsertionSort {
    /**
     * The execution starts from here
     */
    public static void main(String[] args) {
        System.out.println("<---------------- Demo: Insertion Sort ------------------>");

        /** Generating a random array for testing. Please look into 'SortingUtility.java' for the method */
        int[] arr = SortingUtility.generateRandomArray();

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr - an input array to be sorted
     * @description: Divide array into two parts sorted([0..0]) and (unsorted([1..n-1]).
     * Take elements from unsorted swap it to sorted part so that sorted part remains sorted..
     */
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
