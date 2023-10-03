package teorica.classes_utilitarias;

import java.util.Calendar;
import java.util.Date;

public class AulaCalendar {

    public static void main(String[] args) {
        var hoje = Calendar.getInstance(); // singleton -> muito usado em Java EE / Spring

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH); // dia do mes
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.println(dia + "/" + mes + "/" + ano + " " + hora + ":" + minutos + ":" + segundos);
        System.out.printf("Hoje é: %2d/%2d/%d %d:%d:%d", dia, (mes + 1), ano, hora, minutos, segundos);

        hoje.add(Calendar.DAY_OF_MONTH, 30);

        System.out.println();

        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }

}
