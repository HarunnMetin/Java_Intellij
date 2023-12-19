package Day31_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {

    public static void main(String[] args) {

        //kullanicinin verdigi dogum tarihine gore
        //kullanicinin yasini yil ve ay olarak yazdiran bir program hazirlayin

        LocalDate dogumTarihi = LocalDate.of(1990 , 10, 21);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi,bugun)); //P33Y1M28D

        System.out.println(Period.between(dogumTarihi, bugun).getYears()); //33

        LocalDate dogumGunum = LocalDate.of(2001,06,07);
        LocalDate simdikiTarih = LocalDate.now();

        System.out.println(Period.between(dogumGunum, simdikiTarih));

        LocalDate yeniDogumGuum = LocalDate.of(2003,3,20);
        LocalDate bugununTarihi = LocalDate.now();

        System.out.println(Period.between(yeniDogumGuum, bugununTarihi));
    }
}
