package Day09_NestedIfElse_Ternary;

import java.util.Scanner;

public class C07_Ternary {

    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin ve mutlak degerini yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi = scanner.nextInt();

        int sonuc = sayi >0 ? sayi : -1*sayi;
        System.out.println(sonuc);
    }
}
