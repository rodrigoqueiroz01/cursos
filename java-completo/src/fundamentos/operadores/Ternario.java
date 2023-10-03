package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {

        double media = 7.0;

        String resultadoRecuperacao = media >= 5.0 ? "em recuperação." : "reprovado.";
        String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";

        System.out.println("O aluno está " + resultadoFinal);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        String resultado = temDesconto ? "sim" : "não";

        System.out.println("Tem desconto? " + resultado);

    }
}
