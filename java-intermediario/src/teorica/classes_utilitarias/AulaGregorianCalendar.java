package teorica.classes_utilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AulaGregorianCalendar {
    public static void main(String[] args) {
        var hoje1 = Calendar.getInstance(); // bem mais comum.

        var hoje = new GregorianCalendar();
        imprimirData(hoje);

        System.out.println("\n" + hoje.isLeapYear(2023));
    }

    private static void imprimirData(Calendar hoje) {
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int mes = hoje.get(Calendar.MONTH);
        int ano = hoje.get(Calendar.YEAR);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é: %2d/%2d/%d %d:%d:%d", dia, (mes + 1), ano, hora, minutos, segundos);
    }
}
