package Day18_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C03_RakamlariToplamiBulma {

    public static void main(String[] args) {

        /*
        While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("RAKAMLARI TOPLANMAK UZERE BİR SAYİ GİRİN");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;

        int rakamlariToplami = 0;
        int birlerBasamagi = 0;
        while (sayi >0){

            birlerBasamagi = sayi %10;
            rakamlariToplami += birlerBasamagi;
            sayi /=10;
        }
        System.out.println("girilen " + girilenSayi+ " sayisinin rakamlari toplami :" + rakamlariToplami);



    }
}
