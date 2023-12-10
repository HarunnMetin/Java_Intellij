package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar);
        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());

        sayilar.add(1);
        sayilar.add(7);

        System.out.println(sayilar);
        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());

        System.out.println(sayilar.get(1));
        System.out.println(sayilar.contains(3));

        List<Integer>tumSayilar = new ArrayList<>();
        tumSayilar.add(1);
        tumSayilar.add(3);
        tumSayilar.add(5);
        tumSayilar.add(7);

        System.out.println(tumSayilar.containsAll(sayilar));
    }
}
