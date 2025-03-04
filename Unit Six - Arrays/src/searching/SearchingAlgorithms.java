package searching;

import java.util.Arrays;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[25];
        initArray(1, 100, arr);
        printArr(arr);
        int index = linearSearch(arr, 23);
        System.out.println(index);

        Arrays.sort(arr);
        printArr(arr);

        index = binarySearch(arr, 23);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int i) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int midIndex;
        while (minIndex <= maxIndex) {
            midIndex = (minIndex + maxIndex) / 2;
            if (arr[midIndex] == i)
                return midIndex;
            else if (arr[midIndex] < i)
                minIndex = midIndex + 1;
            else
                maxIndex = midIndex - 1;
        }
        return -1;
    }

    private static int linearSearch(int[] arr, int findMe) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findMe) {
                return i;
            }
        }
        return -1;
    }

    private static void initArray(int min, int max, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
