package Day41_Exceptions;

import java.util.Arrays;
import java.util.Objects;

public class C04_NumberFormaException_ClassCastException {


    public static void main(String[] args) {

        String str = "java icin bulunan sonuc sayisi : 4567 , listelenen sonuc sayisi : 25";

        //sonuc sayyisinin 1000'den fazla oldugunu test edin

        String[] kelimeler = str.split(" ");
        String sonucSayisi = kelimeler[6];
        //int sonucSayisiInt = Integer.parseInt(sonucSayisi);

        sonucSayisi = sonucSayisi.replaceAll("\\D","");
        int sonucSayisiInt = Integer.parseInt(sonucSayisi);

        System.out.println(sonucSayisiInt);

        String str2 = "Java";
        //Integer sayi = str2;

        Object obj = str2;
        Integer sayi = (Integer) obj;
        //ClassCastException
        System.out.println(sayi);



    }
}
