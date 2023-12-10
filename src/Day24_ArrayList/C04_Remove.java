package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("kaan");
        isimler.add("bulent");
        isimler.add("tugba");
        isimler.add("burhan");
        isimler.add("kaan");

        System.out.println(isimler);

        System.out.println(isimler.remove("burhan"));
        System.out.println(isimler.remove("kaan"));
        System.out.println(isimler);

        System.out.println(isimler.remove(1));
        System.out.println(isimler);

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);

        System.out.println(sayilar);
        System.out.println(sayilar.remove(2));
        System.out.println(sayilar.remove(1));
        System.out.println(sayilar);

        Integer silinecekElement = 1;
        Integer silinecekElement2 = 3;
        sayilar.remove(silinecekElement);
        sayilar.remove(silinecekElement2);

        System.out.println(sayilar);

        sayilar.clear();
        System.out.println(sayilar);

    }
}
