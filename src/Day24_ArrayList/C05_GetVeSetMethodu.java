package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_GetVeSetMethodu {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("cemil");
        isimler.add("omer");
        isimler.add("mertkan");

        isimler.add(2,"burhan");
        System.out.println(isimler);
        isimler.set(2,"ayse");
        System.out.println(isimler);


    }
}
