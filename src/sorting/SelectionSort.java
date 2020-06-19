package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: pN-junction
 * @date: 15-Jul-2016 1:31:31 AM
 * @description: program to demonstrate Selection Sort algorithm
 * @timeComplexity: O(n2)
 * @spaceComplexity: O(1)
 */
public class SelectionSort {

    /**
     * Execution starts from here
     */
    public static void main(String[] args) {
        System.out.println("<---------------- Demo: Selection Sort ------------------>");

        /** Generating a random array for testing. Please look into 'SortingUtility.java' for the source code */
        int[] arr = SortingUtility.generateRandomArray();

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr - an input array to be sorted
     * @description: The method finds position of i-th minimum element and swaps with index i
     */
    private static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            if (minPos != i) {
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
