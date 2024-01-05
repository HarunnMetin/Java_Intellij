package Day42_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        //index kullanmadan elementleri 2 artirin

        ListIterator listIterator = sayilar.listIterator();

        System.out.println(sayilar);

        while (listIterator.hasNext()){

            Integer sayi = (Integer) listIterator.next();
            listIterator.set(sayi + 2);

        }
        System.out.println(sayilar);

        //iterator kullanarak listenin elementlerini sondan basa dogru yazdirin

        while (listIterator.hasPrevious()){

            Integer sayi = (Integer) listIterator.previous();
            System.out.print(sayi + " ");

        }
    }
}
