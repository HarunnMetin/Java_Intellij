package Day13_StringManipulations_ForLoop;

import java.util.Scanner;

public class C03_ReplaceAll {

    public static void main(String[] args) {

        /*
        kullanicidan bir metin isteyin metindeki tum sayilari ve space dısındaki ozel
        karakterleri temizleyin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println( "lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        metin= metin.replaceAll("\\d" , "");
        System.out.println(metin);
    }

}

