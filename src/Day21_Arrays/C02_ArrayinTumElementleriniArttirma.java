package Day21_Arrays;

import java.util.Arrays;

public class C02_ArrayinTumElementleriniArttirma {

    public static void main(String[] args) {

        /*bir arrayin tum elementlerini arttirin

        int[] arr = {3,4,6,8,1};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            i+=2;
        }
         */

        /*
        Verilen bir int array’in tum elemanlarini
        2 artirip bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.
         */

        int[] arr = {3,4,6,8,1};
        arr = arrayElementleriniİkiArttrMethodu(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayElementleriniİkiArttrMethodu(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=2;
        }
        return arr;
    }
}
