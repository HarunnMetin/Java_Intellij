package Day46_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TreeMapMethodlari {

    public static void main(String[] args) {

        TreeMap<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",2);
        harfler.put("R",3);
        harfler.put("B",4);
        harfler.put("K",5);
        harfler.put("Z",6);
        System.out.println(harfler);

        System.out.println(harfler.tailMap("B"));
        System.out.println(harfler.tailMap("J"));

        System.out.println(harfler.tailMap("A", false));
    }
}
