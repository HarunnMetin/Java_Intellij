package Day40_interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exception {

    public static void main(String[] args) {

        //kullanicidan toplanmak uzere sayilar alin kullanici Q'ya bastiginda islemi bitirn ve girilen
        //sayilarin toplamini yazdirin

        Scanner scanner = new Scanner(System.in);


        int toplam = 0;

        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("lutfen toplanmak uzere sayilar giriniz");
                int girilenSyilar = scanner.nextInt();
                toplam += girilenSyilar;
            }
        } catch (InputMismatchException e) {
            char girilenYanlisHarf = scanner.next().charAt(0);
            if (girilenYanlisHarf == 'Q' || girilenYanlisHarf == 'q'){
                System.out.println("girdiginiz sayilarin toplami :" + toplam);
            }
            else {
                System.out.println("yanlis input program kapatiliyor");
            }
        }

        for (int i = 0; i < 100000; i++) {

            try {
                System.out.println("lutfen toplanmak uzere sayilar giriniz");
                int girilenSyilar = scanner.nextInt();
                toplam += girilenSyilar;

            }catch (InputMismatchException e){

                char girilenYanlisHarf = scanner.next().charAt(0);
                if (girilenYanlisHarf == 'Q' || girilenYanlisHarf == 'q'){
                    System.out.println("girdiginiz sayilarin toplami :" + toplam);
                    break;
                }
                else {
                    System.out.println("yanlis input lutfen bir sayi giriniz");
                }

            }
        }


    }
}
