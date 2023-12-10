package Day15_NestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        /*

        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
        
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir rakam giriniz");
        int sayi = scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" +"  ");
            }
            System.out.println("  ");
        }
    }
}
