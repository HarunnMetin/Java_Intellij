package Day14_ForLoops;

import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen baslangic degeri icin bir pozitif sayi giriniz");
        int baslangic = scanner.nextInt();
        System.out.println("lutfen bitis degeri icin bir pozitif sayi giriniz");
        int bitis = scanner.nextInt();



        if (bitis<baslangic){
            System.out.println("bitis degeri baslangic degerinden kucuk olamaz");
        }
        else {
            long toplam = 0;
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;

            }
            System.out.println("toplam : " + toplam);
        }



    }
}
