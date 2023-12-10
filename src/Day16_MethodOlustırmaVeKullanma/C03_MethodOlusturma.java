package Day16_MethodOlustırmaVeKullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {

    public static void main(String[] args) {

        /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
           -input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyİsim = scanner.nextLine();
        System.out.println(isimSoyisim(isim, soyİsim));


    }
    public static String isimSoyisim(String isim, String soyisim){

        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
        String istenenFormat = isim+" "+soyisim;


        return istenenFormat;
    }

}
