package Day03_Scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {
        /*
        Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
Isminiz : John
Soyisminiz : Doe
Yasiniz : 44
Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scanner.next();
        System.out.println("soyisminizi giriniz");
        String soyisim = scanner.next();
        System.out.println("yasinizi giriniz");
        int yas = scanner.nextInt();
        System.out.println(
                "\nisminiz : " + isim +
                "\nsoyisminiz : " + soyisim +
                "\nyasiniz : "+ yas+
                "\nKAYDINIZ BASARIYLA TAMAMLANMISTIR");
    }
}
