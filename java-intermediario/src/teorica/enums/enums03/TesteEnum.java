package teorica.enums.enums03;

import teorica.enums.enums02.DiaSemana;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values();

        for(DiaSemana dia: dias) {
            System.out.println(dia);
        }

    }

}
