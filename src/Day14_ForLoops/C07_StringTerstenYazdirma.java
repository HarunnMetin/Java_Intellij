package Day14_ForLoops;

import java.util.Scanner;

public class C07_StringTerstenYazdirma {

    public static void main(String[] args) {

        /*
        Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("tersten yazdirmak istdiginiz metni giriniz");
        String metin = scanner.nextLine();

        for (int i = metin.length()-1; i >=0 ; i--) {
            System.out.print(metin.charAt(i));
        }
    }
}
