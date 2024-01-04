package Day40_interfaces;

import java.util.Scanner;

public class C03_Exception {

    public static void main(String[] args) {


        //kullanicidan iki tamsayi isteyin sayilari birbirine bolup sonucu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen 2 tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sonuc = 0;

        if (sayi2 == 0){
            System.out.println("ikinci sayi sifir olama");
        }
        else {
            System.out.println(sayi1/sayi1);
        }




    }
}
