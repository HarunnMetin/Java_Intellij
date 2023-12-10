package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        System.out.println(isimler);

        isimler.add("şeref");
        isimler.add("gulsah");
        isimler.add("burhan");

        System.out.println(isimler);

        isimler.add(2,"adelle");

        System.out.println(isimler);

        isimler.addAll(0,isimler);



    }
}
