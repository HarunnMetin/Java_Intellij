package Day45_Maps;

import Day44_Maps.MethodDeposu;

import java.util.Map;

public class C01_Update {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        /*
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-11-H-MF,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Sevgi-Can-11-K-TM,
        108=Sevgi-Can-9-K-MF,
        109=Sevgi-Can-9-K-TM
        }
         */

        ogrenciMap.put(109,"Sevgi-baytar-11-H-TM");
        System.out.println(ogrenciMap.get(109));
        System.out.println(ogrenciMap);
    }
}
