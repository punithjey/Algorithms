package sorting;

import java.util.Arrays;

/**
 * @author: pN-junction
 * @date: 15-Jul-2016 1:39:14 AM
 * @description: program to demonstrate Bubble Sort algorithm
 * @timeComplexity: O(n2)
 * @spaceComplexity: O(1)
 */
public class BubbleSort {

    /** The execution starts from here */
    public static void main(String[] args) {
        System.out.println("<---------------- Demo: Bubble Sort ------------------>");

        int[] arr = SortingUtility.generateRandomArray();

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
