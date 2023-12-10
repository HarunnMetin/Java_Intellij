package Day09_NestedIfElse_Ternary;

import java.util.Scanner;

public class C08_Ternary {

    public static void main(String[] args) {

        /*
        kullanicidan ay numarasi alip ay ismini yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("YAZDİRMAK İSTEDİGİNİZ AT KACİNİCİ AY");
        int ayNo = scanner.nextInt();

        if (ayNo == 1) System.out.println("OCAK");
        else if (ayNo == 2) System.out.println("SUBAT");
        else if (ayNo == 3) System.out.println("MART");
        else if (ayNo == 4) System.out.println("NİSAN");
        else if (ayNo == 5) System.out.println("MAYİS");
        else if (ayNo == 6) System.out.println("HAZİRAN");
        else if (ayNo == 7) System.out.println("TEMMUZ");
        else if (ayNo == 8) System.out.println("AGOSTOS");
        else if (ayNo == 9) System.out.println("EYLUL");
        else if (ayNo == 10) System.out.println("EKİM");
        else if (ayNo == 11) System.out.println("KASİM");
        else if (ayNo == 12) System.out.println("ARALİK");
        else System.out.println("GİRDİGİNİZ AY NUMARASINDA BİR AY BULUNAMADI");
    }
}
