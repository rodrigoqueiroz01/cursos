package teorica.classes_utilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

public class AulaResourceBundle {

    public static void main(String[] args) {
        System.out.println("Locale atual: " + Locale.getDefault());

        var rb = ResourceBundle.getBundle("ultimocap/meu-texto");
        var rb2 = ResourceBundle.getBundle("ultimocap/meu-texto");

        String hello = rb.getString("hello");
        String world = rb2.getString("world");

        System.out.println("Olá: " + hello);
        System.out.println("Mundo: " + world);

        Locale.setDefault(new Locale("pt_BR", "pt_BR"));
        rb = ResourceBundle.getBundle("ultimocap/meu-texto");
    }

}
