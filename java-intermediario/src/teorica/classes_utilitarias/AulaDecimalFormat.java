package teorica.classes_utilitarias;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class AulaDecimalFormat {

    public static void main(String[] args) {

        String padrao = "###,###,###";
        DecimalFormat df = new DecimalFormat(padrao);

//        df.applyPattern(padrao);
        System.out.println(df.format(1234567890.123));

        var dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        df = new DecimalFormat(padrao, dfs);
        System.out.println(1234567890.123);
    }
}
