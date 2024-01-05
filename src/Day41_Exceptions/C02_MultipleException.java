package Day41_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_MultipleException {

    public static void main(String[] args) {

        String str = "Java Candir";
        int[] arr = {3,5,7,8,2,5,9,0};

        /*
        kullanicidan bir sayi isteyip girilen sayiyi index
        olarak kullanin str'daki o index'deki harfi ve
        array'daki o index'deki sayiyi yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen istediginiz index numarasini giriniz. ");

        int girilenIndex = 0;
        try {
            girilenIndex = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("sizden sayi istedim");
        }

        try {
            System.out.println(str.charAt(girilenIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("girilen index string sinirlari disinda");
        }

        try {
            System.out.println(arr[girilenIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("girilen index arrayin sinirlari disinda ");
        }


        System.out.println("****************************");

        try {
            girilenIndex = scanner.nextInt();
            System.out.println(str.charAt(girilenIndex));
            System.out.println(arr[girilenIndex]);
        }
        catch (InputMismatchException a){
            System.out.println("sizden sayi istedim");
        }
        catch (StringIndexOutOfBoundsException a){
            System.out.println("girilen index string sinirlari disinda");
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("girilen index arrayin sinirlari disinda ");
        }

    }
}
