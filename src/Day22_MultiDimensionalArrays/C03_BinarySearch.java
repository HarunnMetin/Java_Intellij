package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_BinarySearch {

    public static void main(String[] args) {

        int[] arr = {0,13,4,7,10,2,1,23};

        System.out.println(Arrays.binarySearch(arr, 13));
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr, 4));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 13));
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr, 4));

        //olmayan birelementi aratirsak

        System.out.println(Arrays.binarySearch(arr, -5));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr,25));
        System.out.println(Arrays.binarySearch(arr, 44));
    }
}
