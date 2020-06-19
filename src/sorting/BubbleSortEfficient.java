package sorting;

import java.util.Arrays;

/**
 * @author: pN-junction
 * @date: 15-Jul-2016 1:39:14 AM
 * @description: program to demonstrate Bubble Sort algorithm
 * @timeComplexity: O(n2)
 * @spaceComplexity: O(1)
 */
public class BubbleSortEfficient {

    /**
     * The execution starts from here
     */
    public static void main(String[] args) {
        System.out.println("<---------------- Demo: Bubble Sort ------------------>");

        /** Generating a random array for testing. Please look into 'SortingUtility.java' for the method */
        int[] arr = SortingUtility.generateRandomArray();

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        bubbleSortEfficient(arr);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr - an input array to be sorted
     * @description: The method is used to sort array elements using bubble sort
     */
    private static void bubbleSortEfficient(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            /** break the loop if the array is already sorted */
            if (!swapped) break;
        }
    }
}
