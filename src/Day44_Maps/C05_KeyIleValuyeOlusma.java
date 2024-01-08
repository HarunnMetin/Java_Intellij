package Day44_Maps;

import java.util.Map;

public class C05_KeyIleValuyeOlusma {

    public static void main(String[] args) {

        //Numarasi verilen ogrencinin isim soyisim sinif ve subesini yazdirin.

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap.get(109));
        System.out.println(ogrenciMap.get(232));
        MethodDeposu.numaraIleOgrenciBilgisiYazdirma(ogrenciMap,101);
        MethodDeposu.numaraIleOgrenciBilgisiYazdirma(ogrenciMap,104);
        MethodDeposu.numaraIleOgrenciBilgisiYazdirma(ogrenciMap,106);
        MethodDeposu.numaraIleOgrenciBilgisiYazdirma(ogrenciMap,109);
    }
}
