package Day18_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C06_DoWhieLoop {

    public static void main(String[] args) {

        /*
        kullanicidan toplanmak uzere pozitif bir tamsayilar isteyin
        kullanici islemi bitirmek icin 0'a basmalıdır
        kullanici sifira bastiginda kac pozitif sayi girdigini
        ve toplamlarinin kac oldugunu yaziniz


        //once while loopile yapalim

        Scanner scanner;

        int sayac = 0;
        int toplam = 0;
        int girilenSayi = 2;

        while (girilenSayi != 0){
            scanner = new Scanner(System.in);
            System.out.println("lutfen toplanmak uzere pozitif sayi girin");
            girilenSayi = scanner.nextInt();

            if (girilenSayi!=0){
                toplam+=girilenSayi;
                sayac++;
            }

        }
        System.out.println("girdiginiz "+sayac+ " kadar pozitif sayilarin toplami "+toplam);

         */
        Scanner scanner;

        int sayac = 0;
        int toplam = 0;
        int girilenSayi;

        do {

            scanner = new Scanner(System.in);
            System.out.println("lutfen toplanmak uzere pozitif sayi girin");
            girilenSayi = scanner.nextInt();

            if (girilenSayi!=0){
                toplam+=girilenSayi;
                sayac++;
            }

        }while (girilenSayi!=0);
        System.out.println("girdiginiz "+sayac+ " adet pozitif sayilarin toplami "+toplam);


    }
}
