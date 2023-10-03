package teorica.classes_utilitarias;

import java.util.Date;

public class AulaDate {

    public static void main(String[] args) {
        var hoje = new Date();
        System.out.println(hoje);

        System.out.println("Milisegundos desde 1970 " + hoje.getTime());

        System.out.println(hoje.getDate());
    }

}
