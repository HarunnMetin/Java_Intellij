package Day09_NestedIfElse_Ternary;

import java.util.Locale;
import java.util.Scanner;

public class C01_IndirimHesaplama {

    public static void main(String[] args) {

        /*
         Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
         karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
         %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
         alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Aldiginiz urun adadeini giriniz");
        int urunAdedi = scanner.nextInt();
        System.out.println("Aldiginiz urunun liste fiyatini giriniz");
        double listeFiyati = scanner.nextInt();
        System.out.println("Musteri kartiniz varsa 'var' yoksa 'yok' deyiniz");
        char kartVarYok = scanner.next().toLowerCase().charAt(0);

        if (kartVarYok == 'v'){

            if (urunAdedi>10){
                System.out.println("%20 indirim kazandiniz indirimli fiyati: "+urunAdedi*listeFiyati*80/100+"TL");
            }
            else {
                System.out.println("%15 indirim kazandiniz indirimli fiyati: "+urunAdedi*listeFiyati*85/100+"TL");
            }
        }
        else if (kartVarYok =='y') {
            if (urunAdedi>10){
                System.out.println("%15 indirim kazandiniz indirimli fiyati: "+urunAdedi*listeFiyati*85/100+"TL");
            }
            else {
                System.out.println("%10 indirim kazandiniz indirimli fiyati: "+urunAdedi*listeFiyati*90/100 +"TL");
            }
        }

        else {

            System.out.println("kart bulunamadi");
        }


    }
}
