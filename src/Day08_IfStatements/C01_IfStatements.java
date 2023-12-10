package Day08_IfStatements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {

        /*
        kullanicidanbir karakter girmesini isteyin girilen harfin buyuk harf olup olmadigini yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char girilenKarakter = scanner.next().charAt(0);
        if (girilenKarakter>='A' && girilenKarakter <= 'Z'){
            System.out.println("Girilen karakter buyuk harf");
        }
        else {
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
