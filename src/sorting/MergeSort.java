package sorting;

import java.util.Arrays;

/**
 * @author: pN-junction
 * @date: Sep 17, 2016 6:41:22 PM
 * @description: program to demonstrate Merge Sort algorithm
 * @timeComplexity: O(N*logN)
 * @spaceComplexity: O(N)
 */
public class MergeSort {

    /**
     * The execution starts from here
     */
    public static void main(String[] args) {
        System.out.println("<---------------- Demo: Merge Sort ------------------>");

        /** Generating a random array for testing. Please look into 'SortingUtility.java' for the source code */
        int[] arr = SortingUtility.generateRandomArray();

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr - input array to be sorted
     * @param low - index of fist element
     * @param high - index of last element
     * @description: The method sorts array between indices low and high
     */
    private static void mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = low + (high - low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    /**
     * @param arr - input array to be merged
     * @param low - index of first element
     * @param mid - index of mid element
     * @param high - index of last element
     * @description: The method merges two sorted part of the array
     */
    private static void merge(int[] arr, int low, int mid, int high) {
        int leftArrSize = mid - low + 1;
        int rightArrSize = high - mid;

        int[] leftArr = new int[leftArrSize+1];
        int[] rightArr = new int[rightArrSize+1];

        for (int i = 0; i < leftArrSize; i++) {
            leftArr[i] = arr[low+i];
        } leftArr[leftArrSize] = 9999;

        for (int i = 0; i < rightArrSize; i++) {
            rightArr[i] = arr[mid+1+i];
        } rightArr[rightArrSize] = 9999;

        int i = 0;
        int j = 0;

        for (int k = low; k <= high; k++) {
            if(leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i++];
            } else {
                arr[k] = rightArr[j++];
            }
        }
    }
}
