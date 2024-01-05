package Day42_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {

    public static void main(String[] args) {

        int[] arr = {3,4,5,6};

        //index kullanmdadan tum elementleri artirin

        System.out.println("for each loop'dan once arr : " + Arrays.toString(arr));
        for (int each: arr) {
            each+=2;
        }
        System.out.println("for each loop'dan sonra arr : " + Arrays.toString(arr));

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        System.out.println(sayilar);

        Iterator iterator = sayilar.iterator();

        iterator.next();
        iterator.remove();

        System.out.println("ilk iteratordan sonra : " + sayilar);

        iterator.next();
        iterator.remove();

        iterator.next();
        iterator.remove();

        iterator.next();
        iterator.remove();

        iterator.next();
        iterator.remove();

        System.out.println("sayilar listesinin son hali : "+sayilar);




    }
}
