package Day26_ForEachLoop_Constructor;

import java.util.*;

public class C03_OrtakElementleriBulma {

    public static void main(String[] args) {
        /*
        - Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
          ayri bir liste olarak veren bir program yazin.
         */

        int[] arr = {2,3,5,5,3,2,5,6,2,0};
        int[] arr2 = {2,9,5,3,3,2,6,0};

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        for (Integer each1:arr) {


            for (Integer each2 : arr2) {

                if (each1==each2 && !ortakElemanlarListesi.contains(each1)){

                    ortakElemanlarListesi.add(each1);
                }
            }
        }

        Collections.sort(ortakElemanlarListesi);
        System.out.println(ortakElemanlarListesi);

    }
}
