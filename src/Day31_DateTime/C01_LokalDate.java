package Day31_DateTime;

import java.time.LocalDate;

public class C01_LokalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.getMonth());
        System.out.println(tarih.getYear());

        System.out.println(tarih.isLeapYear());

        LocalDate tarih2 = LocalDate.of(2017,1,1);
        System.out.println(tarih2.isLeapYear());

        System.out.println(tarih2.isAfter(tarih) );
        System.out.println(tarih2.isBefore(tarih) );

        System.out.println(tarih2.minusYears(2).minusDays(34).minusMonths(45));

        System.out.println(tarih.lengthOfYear());
        System.out.println(tarih.lengthOfMonth());
    }
}
