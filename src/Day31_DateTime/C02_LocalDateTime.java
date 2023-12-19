package Day31_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C02_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);

        /*
        bir forloop olusturup 1'den 10000'e kadar olan sayilari toplayin islem suresini nano saniye olarak
        yazdirin
         */

        LocalDateTime baslamaZamani = LocalDateTime.now();
        int baslangicZamani = baslamaZamani.getNano();

        System.out.println(tarihSaat.getDayOfWeek());

        int toplam = 0;

        for (int i = 0; i < 10000; i++) {
            toplam += i;
        }

        LocalDateTime bitisZamani = LocalDateTime.now();
        int bitirmeZamani = bitisZamani.getNano();

        System.out.println("islem suresi : " +(bitirmeZamani-baslangicZamani));

    }
}
