package teorica.enums.enums03;

import teorica.enums.enums02.DiaSemana;

public class TesteEnum2 {

    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        var dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        System.out.println(dia);

    }
}
