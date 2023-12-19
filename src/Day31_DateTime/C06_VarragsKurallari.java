package Day31_DateTime;

public class C06_VarragsKurallari {

    public static void main(String[] args) {

        /*
        kullanici kac tane argument girerse girsin
        ilk element haric diger elementleri toplayip
        bulunan toplami ilk element ile carpip, sonucu yazdiran bir method olusturun.
         */

        islemYap(2,4,7);

    }

    public static void islemYap(int ilkSayi, int... kalanlar) {

        int toplam = 0;
        for (int ecahSayi : kalanlar){
            toplam+=ecahSayi;
        }

        int sonuc = toplam * ilkSayi;
        System.out.println("islem sonucu : " + sonuc);

    }


}
