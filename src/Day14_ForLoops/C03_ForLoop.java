package Day14_ForLoops;

import java.util.Scanner;

public class C03_ForLoop {

    public static void main(String[] args) {

        /*
        - Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
          dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
          baslangic degerinden kucuk olsa da program calissin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen baslangic degeri icin bir pozitif sayi giriniz");
        int baslangic = scanner.nextInt();
        System.out.println("lutfen bitis degeri icin bir pozitif sayi giriniz");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;

            }
            System.out.println("toplam : " + toplam);
        }
        if (baslangic>bitis){
            for (int i = bitis; i <=baslangic ; i++) {
                toplam+=i;

            }
            System.out.println("toplam : " + toplam);
        }

    }
}
