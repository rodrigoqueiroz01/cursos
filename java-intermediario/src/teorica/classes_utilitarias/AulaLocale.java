package teorica.classes_utilitarias;

import java.util.Locale;

public class AulaLocale {

    public static void main(String[] args) {
        /*
        * dd/MM/yyyy / 02/01/2000 -> Brasil
        * MM/dd/yyyy / 01-fev-2000 -> EUA
        *
        * 1.000,02 -> Brasil
        * 1,000.02 -> EUA
        * */

        var locale = Locale.getDefault();

//        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale loc : locales) {
            System.out.println("Nome: " + loc.getDisplayName());
            System.out.println("Código da lingua: " + loc.getLanguage());
            System.out.println("Lingua: " + loc.getDisplayLanguage());
            System.out.println("Cod País: " + loc.getCountry());
            System.out.println("País: " + loc.getDisplayCountry());
            System.out.println("***************************************");
        }

        Locale br = new Locale("pt");
        System.out.println(br);

        Locale.setDefault(br);

        System.out.println(Locale.getDefault());
    }

}
