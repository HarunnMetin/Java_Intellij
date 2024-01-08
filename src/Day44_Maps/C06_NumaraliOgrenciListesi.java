package Day44_Maps;

import java.util.Map;

public class C06_NumaraliOgrenciListesi {

    public static void main(String[] args) {

        //tum ogrencileri No, isim ,soyisim olarak yazdirin

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.numaraliOgrenciListesiYazdir(ogrenciMap);

    }
}
