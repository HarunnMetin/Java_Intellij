package Day17_MethodOlusturmaMethodOverloading;

import java.util.Scanner;

public class C02_TamBolenlerSayisi {

    public static void main(String[] args) {

        /*
        - Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
          bolenleri sayisini bulup bize donduren bir method olusturun
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        tamBolenSayisi(sayi);
        
    }
    public static int tamBolenSayisi(int sayi){

        int sayac = 0;


        for (int i = 1; i <=sayi ; i++) {
            if(sayi%i==0){
                sayac++;

            }
        }
        System.out.println(sayac);

        return sayac;
    } 
}
