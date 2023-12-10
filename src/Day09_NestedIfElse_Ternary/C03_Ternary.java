package Day09_NestedIfElse_Ternary;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        /*
        kullanicidan pozitif bir tamsayi alin sayinin tek mi cift mi oldugunu yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi girin");
        int sayi = scanner.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cift");
        }
        else {
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0 ? "çift sayi" : "tek sayi");
    }
}
