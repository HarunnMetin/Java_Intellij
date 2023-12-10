package Day21_Arrays;

import java.util.Arrays;

public class C03_PozitifElementleriTopla {

    public static void main(String[] args) {

        /*
        Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        method yaziniz.
         */

        int[] arr = {-4,-5,5,2,14,0,-3}; // beklenen output pozitif elementin toplami 10
        System.out.println(pozitifElementleriTopla(arr));

    }
    public static int pozitifElementleriTopla(int[]arr){
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length >0){
                toplam+=arr[i];
            }
        }
        return toplam;
    }
}
