package teorica.classes_utilitarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class AulaDatasJava8 {

    /*
     * plus: mais
     * minus: menos
     *
     * Data do dia: LocalDate
     * Hora do dia: LocalTime
     * Data/Hora do dia: LocalDateTime
     * */

    public static void main(String[] args) {

        var agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2023, 8, 3));
        System.out.println(LocalDate.parse("2023-08-03"));

        System.out.println(agora.plusDays(30));

        System.out.println(agora.minus(1, ChronoUnit.MONTHS));

        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());

        System.out.println(LocalDate.parse("2023-08-03").isLeapYear());

        LocalTime horaAgora = LocalTime.now();
        System.out.println(horaAgora);

        System.out.println(LocalTime.of(20, 18));
        System.out.println(LocalTime.parse("20:18"));

        System.out.println(horaAgora.plusMinutes(60));
        System.out.println(horaAgora.minus(40, ChronoUnit.MINUTES));

        System.out.println(horaAgora.getHour());

        // data completa = data + data
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        var fuso = ZoneId.systemDefault();

        Set<String> fusos = ZoneId.getAvailableZoneIds();
//        for (String f : fusos) {
//            System.out.println(f);
//        }

    }

}
