package Day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*
        Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen dairenin yarıçapını giriniz");
        double yarıçap= scanner.nextDouble();

        System.out.println("çemberin cevresi : " +2*3.14*yarıçap);
        System.out.println("dairenin alanı : " + 3.14*yarıçap*yarıçap);


    }
}
