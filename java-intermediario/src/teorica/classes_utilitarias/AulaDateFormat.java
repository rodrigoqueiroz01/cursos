package teorica.classes_utilitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AulaDateFormat {

    public static void main(String[] args) {
        var hoje = new Date();

        System.out.println(Locale.getDefault());

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println("Brasil - " + hojeFormatado);

        Locale.setDefault(new Locale("en", "US"));

        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println("EUA - " + hojeFormatado);

        Locale.setDefault(new Locale("pt", "Brazil"));

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println("Hoje formatado - " + hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado); // dd/MMM/yyyy

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println("Hora curta: " + hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println("Hora média: " + hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println("Hora longa: " + hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
        System.out.println("Data/Hora: " + hojeFormatado);

        String data = "12-02-2017 14:25";
        try {
            var dataDate = DateFormat.getInstance().parse(data);
            System.out.println(dataDate);

            var calendario = Calendar.getInstance();
            calendario.setTime(dataDate);
            System.out.println(calendario);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
