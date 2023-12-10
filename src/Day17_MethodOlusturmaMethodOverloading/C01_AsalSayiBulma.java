package Day17_MethodOlusturmaMethodOverloading;

import java.util.Scanner;

public class C01_AsalSayiBulma {

    public static void main(String[] args) {

        /*
        Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        sonuclarini donduren bir method olusturun
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        System.out.println(asalSayiKontrol(sayi));


    }
    public static boolean asalSayiKontrol(int sayi){

        boolean flag = true;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("SAYİ ASALDİR");
            return true;
        }
        else {
            System.out.println("SAYİ ASAL DEGİLDİR");
            return false;
        }

    }
}
