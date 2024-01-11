package Day46_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C04_NestedMap {

    public static void main(String[] args) {

        /*
        {
        101=isim=Ali,soyisim=Can,sinif=11,sube=H,bolum=MF
        102=Veli-Cem-9-K-TM,
        103=Ali-Cem-10-K-TM,
        }
         */
        Map<Integer,Map<String,Object>> ogrenciMap = new HashMap<>();


        Map<String,Object> ogrenci101Bilgileri = new HashMap<>();
        ogrenci101Bilgileri.put("isim","Ali");
        ogrenci101Bilgileri.put("soyism","Can");
        ogrenci101Bilgileri.put("Sinif",11);
        ogrenci101Bilgileri.put("Sube","H");
        ogrenci101Bilgileri.put("Bolum","MF");

        Map<String,Object> ogrenci102Bilgileri = new HashMap<>();

        ogrenci102Bilgileri.put("isim ","Veli");
        ogrenci102Bilgileri.put("soyisim","Cem");
        ogrenci102Bilgileri.put("Sinif",9);
        ogrenci102Bilgileri.put("Sube","K");
        ogrenci102Bilgileri.put("Bolum","TM");

        Map<String,Object> ogrenci103Bilgileri = new HashMap<>();

        ogrenci103Bilgileri.put("isim","Ali");
        ogrenci103Bilgileri.put("soyisim","Cem");
        ogrenci103Bilgileri.put("Sinif",10);
        ogrenci103Bilgileri.put("Sube","K");
        ogrenci103Bilgileri.put("Bolum","TM");

        //simdi asil map'e bilgileri girebiliriz

        ogrenciMap.put(101,ogrenci101Bilgileri);
        ogrenciMap.put(102,ogrenci102Bilgileri);
        ogrenciMap.put(103,ogrenci103Bilgileri);
        System.out.println(ogrenciMap);

        //103 numarali ogrencinin soyismini yazdirin

        System.out.println(ogrenciMap.get(103).get("soyisim"));

        //101 numarali ogrencinin ismini yazdirin

        System.out.println(ogrenciMap.get(101).get("isim"));
    }
}

