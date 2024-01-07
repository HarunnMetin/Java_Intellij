package Day44_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MethodDeposu {

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-H-MF");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Sevgi-Can-11-K-TM");
        ogrenciMap.put(108,"Sevgi-Can-9-K-MF");
        ogrenciMap.put(109,"Sevgi-Can-9-K-TM");

        return ogrenciMap;
    }

    public static void isimSoyisimListesiYazdir(Map<Integer,String> ogrenciMap){

        Collection<String> valueCollection = ogrenciMap.values();

        System.out.println("Sira No Isim  Soyisim");
        System.out.println("*********************");
        int siraNo = 1;
        for (String eachvalue: valueCollection) {

            String[] valueArr = eachvalue.split("-");
            System.out.println(siraNo  + " - " + valueArr[0] + " " + valueArr[1]);
            siraNo++;

        }
    }

    public static void sinifSubedekiOgrenciListesiYazdir(Map<Integer, String> ogrenciMap , int sinif , String sube){


        Collection<String> sinifSube = ogrenciMap.values();
        String sinifstr = sinif + "";
        int siraNo = 1;
        for (String eachValue: sinifSube) {

            String[] valueArr = eachValue.split("-");
            if (valueArr[2].equals(sinifstr) && valueArr[3].equalsIgnoreCase(sube)){

                System.out.println(siraNo+ " - " + valueArr[0] +" "+ valueArr[1]);
                siraNo++;
            }
        }
    }
    public static void isimSoyisimYazdirSubeSinifYazdir(Map<Integer,String> ogrenciMap, String isim, String soyisim){

        Collection<String> ogrenciMap1 = ogrenciMap.values();
        int siraNo = 1;
        for (String eachOgrenciIsimSoyism: ogrenciMap1) {

            String[] isimSoyisimArr = eachOgrenciIsimSoyism.split("-");

            if (isimSoyisimArr[0].equalsIgnoreCase(isim) && isimSoyisimArr[1].equalsIgnoreCase(soyisim)){

                System.out.println(siraNo + " - "+isimSoyisimArr[0] +"-"+ isimSoyisimArr[1] +"-"+isimSoyisimArr[2]+"-"+ isimSoyisimArr[3]);
                siraNo++;

            }

        }
    }

}
