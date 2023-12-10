package Day14_ForLoops;

import java.util.Scanner;

public class C01_SifreKontrolu {

    public static void main(String[] args) {

        /*
         Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
         duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
         basariyla kaydedildi" yazdirin
          - ilk harf kucuk harf olmali
          - son karakter rakam olmali
          - sifre bosluk icermemeli
          - uzunlugu en az 10 karakter olmali
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("LUTFEN BİR SİFRE OLUSTURUNUZ");
        String sifre = scanner.nextLine();

        boolean flag = true;

        //ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >='a' && ilkHarf <= 'z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag = false;
        }

        //son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter >= '0' && sonKarakter <= '9')){
            System.out.println("son karakter rakam olmali");
            flag= false;
        }

        // sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag = false;
        }

        //uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>10)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag = false;
        }

        if (!(flag)){
            System.out.println("TEKRAR DENEYİNİZ");
        }
        else {
            System.out.println("SİFRE BASARİYLA OLUSTURULDU");
        }


    }
}
