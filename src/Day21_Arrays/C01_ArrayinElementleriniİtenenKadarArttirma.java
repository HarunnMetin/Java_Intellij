package Day21_Arrays;

import java.util.Arrays;

public class C01_ArrayinElementleriniİtenenKadarArttirma {

    public static void main(String[] args) {

        int[] arr = {3,5,2,1,10};
        int artis = 4;
        //verilenarray'in tum elementlerini artis miktari kadar artirin

        for (int i = 0; i < arr.length; i++) {
            arr[i] +=artis;
        }
        System.out.println(Arrays.toString(arr));

        int[] sayilar = {3,5,2,1,10};
        System.out.println(Arrays.toString(elementleriArttir(sayilar,200)));
    }

    public static int[] elementleriArttir(int[] arr , int artis){

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=artis;
        }
        return arr;
    }
}
