package teorica.classes_utilitarias;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class AulaTimeZone {

    public static void main(String[] args) {

        var calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();
        System.out.println(tz);

//        String[] fusos = TimeZone.getAvailableIDs();
//        for (String fuso : fusos) { // busca todos os ids do mundo.
//            System.out.println(fuso);
//        }

        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");

        System.out.println(tzSP.getDisplayName());
        System.out.println(tzSP.getID());

        var agora = Calendar.getInstance();
        var sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));

        var agoraSP = Calendar.getInstance(tzSP);
        System.out.println(agoraSP.getTimeZone());
        System.out.println(sdf.format(agoraSP.getTime()));

        agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset(System.currentTimeMillis()) / 1000 / 60 / 60);
        System.out.println(sdf.format(agoraSP.getTime()));

    }

}
