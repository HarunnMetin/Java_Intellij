package Day29_PasByValue;

import java.util.Arrays;

public class C04_PassByValueCokluElement {

    public static void main(String[] args) {

        /*
        verilen bir int array'in elementlerini 2 katina cikarip yazdiran bir methodyaziniz
         */

        int[] arr = {3,4,5};
        elementleriArttir(arr);

        System.out.println("***************************");

        /*
        verilen arraya 10 deferini element olarak ekleyip yazdiran bir method yaziniz
         */

        int[] arr2 = {3,4,5};

        elementEkle(arr2);

    }

    public static void elementEkle(int[] arr){

        int[] yeniArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] += arr[i];
        }
        yeniArr[yeniArr.length-1] = 10;

        arr = yeniArr;
        System.out.println(Arrays.toString(yeniArr));

    }

    public static void elementleriArttir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }


}
