package Day42_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        //index kullanmadan 10'dan buyuk elementleri silin

        /*
        for (Integer each: sayilar) {
            if (each>10){
                sayilar.remove(each);
            }
        }
        System.out.println(sayilar);
         */

        Iterator iterator = sayilar.iterator();

        while (iterator.hasNext()){
            Integer sayi = (Integer) iterator.next();
            if (sayi>10){
                iterator.remove();
            }
        }

        System.out.println(sayilar);

        /*
        sayilar = new ArrayList<>();

        sayilar.add(15);
        sayilar.add(23);
        sayilar.add(12);
        sayilar.add(13);
        sayilar.add(11);

        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i) >10){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar);

         */


    }
}
