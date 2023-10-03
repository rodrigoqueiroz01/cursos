package teorica.classes_utilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class AulaSimplesDateFormat {

    public static void main(String[] args) {

        var sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss a z");

        var data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);

        System.out.println(sdf.format(data.getTime()));

        var hoje = new Date();

        System.out.println(sdf.format(hoje));

        var sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";

        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
