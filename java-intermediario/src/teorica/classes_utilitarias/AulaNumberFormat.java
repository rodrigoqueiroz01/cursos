package teorica.classes_utilitarias;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class AulaNumberFormat {

    public static void main(String[] args) {
        /*
        * 1.000,00 - Brasil
        * 1,000.00 - EUA
        * */

        var en = new Locale("en", "United States");
        NumberFormat nf = NumberFormat.getInstance(en);

        String numero = nf.format(100.99);
        System.out.println(numero);

        Locale br = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(br);
        numero = nf.format(100.99);
        System.out.println(numero);

        // MOEDA
        var moeda = NumberFormat.getCurrencyInstance(en);

        String valor = moeda.format(100.99);
        System.out.println(valor);

        var currency = moeda.getCurrency();
        System.out.println(currency);

        // PORCENTAGEM
        var porcent = NumberFormat.getPercentInstance();
        String porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);

        porcent.setMinimumIntegerDigits(4);
        porcent.setMinimumIntegerDigits(3);

        porcent.setMaximumFractionDigits(2);
        porcent.setMinimumFractionDigits(1);

        porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);

        // ARREDONDAMENTO
        nf = NumberFormat.getInstance();

        nf.setRoundingMode(RoundingMode.DOWN);
        nf.setMinimumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.50));
    }

}
