package Day43_Collections;

import java.util.*;

public class C03_ArraydanTekrarEdenleriSilme {

    public static void main(String[] args) {

        int[] arr = {1,2,4,6,4,3,2,4,5,6,7,8,3,5,6,7,8,};

        /*
        verilen array'da tekrar eden elementleri silip array'i
        her elementin 1 kere bulundugu bir hale donusturun.
         */


        /*
        assagida yaptigim islemin ozeti; bos bir liste olusturup
        array'daki elementleri tek tek ele aldim ele aldigim element list'de
        yoksa list'e ekledim
         */
        List<Integer> tekrarsizList = new ArrayList<>();

        for (int each: arr) {
            if (!tekrarsizList.contains(each)){
                tekrarsizList.add(each);
            }
        }
        System.out.println(tekrarsizList);

        //ayni islemi set ile daha kolay yapabiliriz

        Set<Integer> tekrarsizListSet = new TreeSet<>();

        for (int each: arr) {
            tekrarsizListSet.add(each);
        }
        System.out.println(tekrarsizListSet);

        //tekrarsiz elementleri set olarak elde ettik

        //array'i set'deki elementlerdenolusan hale donusturelim

        arr = new int[tekrarsizListSet.size()];

        int index = 0;
        for (Integer each : tekrarsizListSet) {

            arr[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(arr));


    }
}
