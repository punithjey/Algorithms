package sorting;

import java.util.Random;

/**
 * @author: pN-junction
 * @date: 15-Jul-2016 1:39:14 AM
 * @description: It is a helper class for sorting algorithm
 * @timeComplexity: O(n2)
 * @spaceComplexity: O(1)
 */
public class SortingUtility {

    /**
     * @description: The method is used to generate a random array of random size
     * @return: Randomly generated array
     */
    public static int[] generateRandomArray() {
        Random random = new Random();
        int size = random.nextInt(40);

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }

        return arr;
    }
}
