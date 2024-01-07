package Day44_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C03_SinifListesi {

    public static void main(String[] args) {

        //ogrenci map'da sinif ve sube verdigimizde o sinifta bulunan ogrenci
        //isim ve soyisimlerini yazdirin

        Map<Integer,String> ogrenciSinifSube = new TreeMap<>();

        ogrenciSinifSube.put(101,"Ali-Can-11-H-MF");
        ogrenciSinifSube.put(102,"Veli-Cem-10-H-MF");
        ogrenciSinifSube.put(103,"Ali-Cem-11-K-TM");
        ogrenciSinifSube.put(104,"Ali-Ercan-10-K-TM");
        ogrenciSinifSube.put(105,"Ayse-Can-10-H-MF");
        ogrenciSinifSube.put(106,"Sevgi-Cem-11-M-TM");
        ogrenciSinifSube.put(107,"Sevgi-Erdem-11-M-TM");
        ogrenciSinifSube.put(108,"Sevgi-Can-10-K-MF");
        ogrenciSinifSube.put(109,"Adem-Can-10-K-MF");

        MethodDeposu.sinifSubedekiOgrenciListesiYazdir(ogrenciSinifSube , 11,"h");


    }
}
