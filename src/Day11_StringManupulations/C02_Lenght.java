package Day11_StringManupulations;

import java.util.Scanner;

public class C02_Lenght {

    public static void main(String[] args) {

        String isim = "ewery champion has feel thing";
        System.out.println(isim.length());

        System.out.println("son harf :" + isim.charAt(isim.length()-1));
        System.out.println(isim.charAt(isim.length()-5));

        /*
        kullanicidan ismini alin ve ortadaki harfi yazdirin ismin uzunlugu cift sayi ise orta kisimdaki
        iki harfi yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi yazdirin");
        String isimm = scanner.next();




    }
}
