package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_VarOlanArrayaYeniDegerAtama {

    public static void main(String[] args) {

        int[] arr = {3,4,5,6,8,1};
        System.out.println(arr.length);

        arr[4] =200;
        System.out.println(Arrays.toString(arr));

        arr = new int[8];
        System.out.println(Arrays.toString(arr));

        String[] harfler = {"a","n","y"};
        String[] yeniHarfler = {"k","l","m","n"};

        harfler=yeniHarfler;
        System.out.println(Arrays.toString(harfler));
    }
}
