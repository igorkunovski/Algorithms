/*
The performance of this algorithm is O(n*log n) in every scenario. Firstly we build binary tree from the list where
every parent has 2 children. First main parent is the list[0] elem, it's children: left: list[1], right: list[2]
and so on. After it is built - the idea is that every parent must be bigger than its children. The main parent must
become the largest item of tree. With every compare and swap data also migrate in the position number of the list.
After the largest is found, its position list[0] - it is placed at the end of the list. Last item of the list comes
to the place of the main parent list[0] and finding new largest main parent starts from the beginning until list is
fully sorted.
 */

import java.util.Arrays;
import java.util.Random;

public class HeapSort {

    public static void main(String[] args) {

        int n = 25;
        int[] generated = generateArray(20);
        System.out.println(Arrays.toString(generated));

        heapSortArr(generated);
        System.out.println(Arrays.toString(generated));

    }

    private static void heapSortArr(int[] array) {

        int n = array.length;
        for (int i = n/2 -1; i>=0; i--) {
            updateHeap(array, i, n);
        }
        for (int i = n -1; i>= 0; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            updateHeap(array, 0, i);
        }
    }

    private static void updateHeap(int[] array, int i, int n) {
        int left = i * 2 +1;
        int right = i * 2 +2;
        int largest = i;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }
        if (i!=largest){
            swapLargest(array, i, largest);

            updateHeap(array, largest, n);
        }
    }

    private static void swapLargest(int[] array, int i, int largest) {
        int temp = array[i];
        array[i] = array[largest];
        array[largest] = temp;
    }

    private static int[] generateArray(int n) {
        int [] array = new int[n];
        Random rnd = new Random();
        for (int i = 0; i< n; i++) {
            array[i] = rnd.nextInt(-10, 50);
        }
        return array;
    }
}
