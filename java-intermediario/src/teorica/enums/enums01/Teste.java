package teorica.enums.enums01;

public class Teste {

    public static void main(String[] args) {
        usandoConstantes();
        System.out.println();
        usandoEnum();
    }

    private static void usandoConstantes() {
        int segunda = DiaSemanaConstantes.SEGUNDA; // não me garante de não usar um 1, por exemplo.
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando CONSTANTE: ");
        imprimiDiaSemana(segunda);
        imprimiDiaSemana(terca);
        imprimiDiaSemana(quarta);
        imprimiDiaSemana(quinta);
        imprimiDiaSemana(sexta);
        imprimiDiaSemana(sabado);
        imprimiDiaSemana(domingo);
    }

    private static void imprimiDiaSemana(int dia) {
        switch (dia) {
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Nenhum dia selecionado.");
        }
    }

    private static void imprimiDiaSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA -> System.out.println("Segunda-feira");
            case TERCA -> System.out.println("Terça-feira");
            case QUARTA -> System.out.println("Quarta-feira");
            case QUINTA -> System.out.println("Quinta-feira");
            case SEXTA -> System.out.println("Sexta-feira");
            case SABADO -> System.out.println("Sábado");
            case DOMINGO -> System.out.println("Domingo");
            default -> System.out.println("Nenhum dia selecionado.");
        }
    }

    private static void usandoEnum() { // facilidade de controle
        var segunda = DiaSemana.SEGUNDA;
        var terca = DiaSemana.TERCA;
        var quarta = DiaSemana.QUARTA;
        var quinta = DiaSemana.QUINTA;
        var sexta = DiaSemana.SEXTA;
        var sabado = DiaSemana.SABADO;
        var domingo = DiaSemana.DOMINGO;

        System.out.println("Teste utilizando ENUM: ");
        imprimiDiaSemana(segunda);
        imprimiDiaSemana(terca);
        imprimiDiaSemana(quarta);
        imprimiDiaSemana(quinta);
        imprimiDiaSemana(sexta);
        imprimiDiaSemana(sabado);
        imprimiDiaSemana(domingo);
    }

}
