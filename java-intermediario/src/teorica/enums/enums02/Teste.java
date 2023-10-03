package teorica.enums.enums02;

public class Teste {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());

        var data = new Data(1, 4, 2016, DiaSemana.SEXTA);

    }

}
