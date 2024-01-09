package Day45_Maps;

import java.util.HashMap;
import java.util.Map;

public class C07_MapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new HashMap<>();

        harfler.put("A",2);
        harfler.put("R",3);
        harfler.put("B",4);
        harfler.put("K",5);
        harfler.put("Z",6);
        System.out.println(harfler);

        harfler.put("Z",-6);
        System.out.println(harfler);
        System.out.println(harfler.containsKey("K"));
        System.out.println(harfler.containsValue(4));

        System.out.println(harfler.getOrDefault("Z", 0));
        System.out.println(harfler.getOrDefault("K", 0));

        System.out.println(harfler.replace("F", 90));
        System.out.println(harfler);

        System.out.println(harfler.replace("K", 90));
        System.out.println(harfler);

        System.out.println(harfler.remove("Y"));
        System.out.println(harfler);
    }
}
