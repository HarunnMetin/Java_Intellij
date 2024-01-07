package Day44_Maps;

import java.util.Map;

public class C02_IsimListesi {

    public static void main(String[] args) {

        //ogrenci map'inde bulunan ogrencilerin isim ve soyisimlerini sira numarali
        //bir liste olarak yazdirin

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();
        ogrenciMap.put(110,"Kaan-Can-12-K-MF");
        ogrenciMap.put(111,"HARUN-METİN-12-K-MF");

        System.out.println(ogrenciMap);

        MethodDeposu.isimSoyisimListesiYazdir(ogrenciMap);
    }
}
