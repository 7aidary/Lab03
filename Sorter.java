import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));



    }
   public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public class InsertionSort {
    public static void sort(int[] array) {
        int length = array.length;
        for (int index = 1; index < length; index++) {
            int currentElement = array[index];
            int previousIndex = index - 1;

            while (previousIndex >= 0 && array[previousIndex] > currentElement) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }
            array[previousIndex + 1] = currentElement;
        }
    }
}
}

