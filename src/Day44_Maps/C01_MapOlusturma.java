package Day44_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_MapOlusturma {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali - Can - 11 - H - MF");
        ogrenciMap.put(102,"Veli - Cem - 11 - H - MF");
        ogrenciMap.put(103,"Ali - Cem -11 - K -TM");
        ogrenciMap.put(104,"Ayse - Can - 10 - 10 - H - MF");
        ogrenciMap.put(105,"Sevgi - Cem - 11 - M - TM");
        ogrenciMap.put(106,"Sevgi - Can -10 - K - MF");

        System.out.println(ogrenciMap);

        /*
        {101=Ali - Can - 11 - H - MF,
        102=Veli - Cem - 11 - H - MF,
        103=Ali - Cem -11 - K -TM,
        104=Ayse - Can - 10 - 10 - H - MF,
        105=Sevgi - Cem - 11 - M - TM,
        106=Sevgi - Can -10 - K - MF}
         */

        System.out.println(ogrenciMap.keySet()); //[101, 102, 103, 104, 105, 106]
        System.out.println(ogrenciMap.values());
    }
}
