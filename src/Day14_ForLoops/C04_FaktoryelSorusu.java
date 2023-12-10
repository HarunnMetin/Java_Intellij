package Day14_ForLoops;

import java.util.Scanner;

public class C04_FaktoryelSorusu {

    public static void main(String[] args) {

        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen 20'den kucuk bir sayi giriniz");
        int sayi = scanner.nextInt();

        int faktoryel = 1;

        if (sayi>=20){
            System.out.println("lutfen 20'den kucuk bir sayi giriniz");

        }
        else {
            for (int i = 1; i <=sayi ; i++) {
                faktoryel *= i;
            }
            System.out.println("girmis oldugunuz sayinin faktoryeli : " +faktoryel);
        }
    }
}
