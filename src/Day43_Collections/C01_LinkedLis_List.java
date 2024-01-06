package Day43_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedLis_List {

    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();

        isimler.add("omer");
        isimler.add("cemil");
        isimler.add("nergiz");

        List<String> ikinciList = new ArrayList<>();

        ikinciList.add("mustafa");
        ikinciList.add("cemil");

        System.out.println(isimler.retainAll(ikinciList));
        System.out.println(isimler);

        ikinciList.retainAll(isimler);
        System.out.println(ikinciList);
    }
}
