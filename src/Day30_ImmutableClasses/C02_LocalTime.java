package Day30_ImmutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());

        System.out.println(time.minusMinutes(55)); //dakika
        System.out.println(time.minusHours(10000000)); //saat

        System.out.println(time.withHour(15) );

        LocalTime time1 = LocalTime.of(12,12);
        LocalTime time2 = LocalTime.of(15,34);

        System.out.println(time1.isBefore(time2));
        System.out.println(time1.isAfter(time2));

    }
}
