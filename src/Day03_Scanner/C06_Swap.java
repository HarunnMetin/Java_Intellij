package Day03_Scanner;

import java.util.Scanner;

public class C06_Swap {

    public static void main(String[] args) {

        /*
        Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1=scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int swap= sayi1;
        sayi1 = sayi2;
        sayi2 = swap;

        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}
