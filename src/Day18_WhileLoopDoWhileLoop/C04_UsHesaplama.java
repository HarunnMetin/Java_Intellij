package Day18_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C04_UsHesaplama {

    public static void main(String[] args) {

        /*
        - Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
          kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
          olusturun.

         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen ussunu hesaplamak istediginiz bir sayi giriniz");
        double girilenSayi = scanner.nextDouble();
        System.out.println("lutfen bir us giriniz");
        int us = scanner.nextInt();

        usHesaplama(girilenSayi , us);


    }
    public static void usHesaplama(double sayi,int us){

        double sonuc = 1;
        while (us>0){
            sonuc *= sayi;
            us--;
        }
        System.out.println(sonuc);
    }
}
