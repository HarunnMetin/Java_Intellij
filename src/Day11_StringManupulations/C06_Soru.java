package Day11_StringManupulations;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        /*
        : kullanicidan bir mail alin
            - mail @ icermiyorsa "gecersiz mail"
            - mail @gmail.com icermiyorsa, "mail gmail olmali"
            - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen e-mail adresinizi giriniz");
        String mail = scanner.nextLine();

        if (mail.contains("@")==false){
            System.out.println("Gecersiz email");
        } else if (mail.contains("@gmail.com")==false) {
            System.out.println("Mail gmail olmali");
        } else if (mail.endsWith("@gmail.com")==false) {
            System.out.println("mailde yazim hatasi var");
        }
        else {
            System.out.println("Hatasiz mail");
        }
    }
}
