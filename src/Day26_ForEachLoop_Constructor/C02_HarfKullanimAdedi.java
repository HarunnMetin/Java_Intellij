package Day26_ForEachLoop_Constructor;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class C02_HarfKullanimAdedi {

    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */

        String cumle = "java her gecen gun daha da zevkli hale geliyor";
        String harf = "g";
        int sayac =0;

        String[] cumleArr = cumle.split("");

        for (String each : cumleArr) {

            if (each.equals(harf)){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("harf cumlede kullanilmamistir");
        }
        else {
            System.out.println("harf cumlede "+sayac+" defa kullanilmistir");
        }

    }
}
