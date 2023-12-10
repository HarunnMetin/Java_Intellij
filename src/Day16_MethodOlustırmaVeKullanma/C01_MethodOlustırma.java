package Day16_MethodOlustırmaVeKullanma;

import java.util.Scanner;

public class C01_MethodOlustırma {

    public static void main(String[] args) {

        /*
        Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
           - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
             mesaji verin
           - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
             yazdirin.

         */
        baslangicBitis("ben basaracagim" ,0 , 73);


    }
    public static void baslangicBitis(String metin, int basklangic,int bitis){


        //kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        //mesaji verin
        if (basklangic>bitis){
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
        }
        // kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        // yazdirin.

        else if (metin.length() == -1) {
            System.out.println("index numarasi hatali");
        }
        else {


            for (int i = basklangic; i <bitis ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }
}
