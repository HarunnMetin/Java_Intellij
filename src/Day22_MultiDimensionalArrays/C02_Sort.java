package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_Sort {

    public static void main(String[] args) {

        String[] harfler = {"L","a","P","d","T","t"};
        System.out.println(Arrays.toString(harfler));

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));

        String[] isimler = {"Ayse","Yusuf","Bugra","Abdullah","Nergiz","gunay","ramazan"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        int[] sayilar = {4,78,4,2,98,3,23,12,32,43,12,3,7,1};

        Arrays.sort(sayilar,4,14);

        System.out.println(Arrays.toString(sayilar));
    }
}
