package Day22_MultiDimensionalArrays;

public class C01_Arrays {

    public static void main(String[] args) {

        String[] isimler = {"Ayse","Yusuf","Bugra","Abdullah","Nergiz","gunay","ramazan"};

        //verilen bir arraydaki uzunlugu tek sayi olan isimnleri yan yana aralarinda bir bosluk
        //birakarak yazdirin en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin.
        int sayac = 0;
        int kelimeUzunlugu = 0;
        for (int i = 0; i < isimler.length; i++) {

            kelimeUzunlugu = isimler[i].length();

            if (kelimeUzunlugu % 2 != 0){
                System.out.println(isimler[i] + " ");
                sayac++;

            }


        }
        System.out.println("dizide " + sayac + " adet isim yazdirilmistir");
    }
}
