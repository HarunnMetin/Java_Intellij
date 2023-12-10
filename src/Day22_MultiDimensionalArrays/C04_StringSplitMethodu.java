package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_StringSplitMethodu {

    public static void main(String[] args) {

        String str = "Java candir, Selenium heyecan";

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler));

        String[] yeniArr = str.split(", ");
        System.out.println(Arrays.toString(yeniArr));

        String[] harfBol = str.split("a");
        System.out.println(Arrays.toString(harfBol));

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
    }
}
