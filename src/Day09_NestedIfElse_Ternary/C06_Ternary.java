package Day09_NestedIfElse_Ternary;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

        /*
         Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println(sayi1>sayi2 ? "ilk girdiginiz sayi buyuktur" : "ikinci girdiginiz sayi buyuktur");
    }
}
