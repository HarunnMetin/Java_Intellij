package Day20_Array;

import java.util.Arrays;

public class C01_ArrayElementleriniGuncellem {

    public static void main(String[] args) {

        int[] sayilar = new int[6];
        System.out.println(Arrays.toString(sayilar));

        //2.indexteki elementi 5 yapin

        sayilar[2] = 5;
        System.out.println(Arrays.toString(sayilar));

        //2. indexi 7 yapin

        sayilar[2] =7;

        System.out.println(Arrays.toString(sayilar));

        sayilar[5] = 8;
        System.out.println(Arrays.toString(sayilar));


    }
}
