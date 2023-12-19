package Day31_DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C03_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat);

        //sadece gun ay yilseklinde yazdirin

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd / MMMM / yyyy");
        System.out.println(tarihSaat.format(dtf));

        //saati saat : dakika seklinde yazdirin

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH : mm a");
        System.out.println(tarihSaat.format(dtf2));

    }
}
