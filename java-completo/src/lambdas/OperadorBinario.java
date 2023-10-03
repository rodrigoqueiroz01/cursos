package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        // forma 1 de fazer
        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aluno(a) Aprovado(a)" : "Aluno(a) Reprovado(a)";

        // forma 2 de fazer
        BiFunction<Double, Double, String> resultado1 = (n1, n2) -> {
            var notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aluno(a) Aprovado(a)" : "Aluno(a) Reprovado(a)";
        };
        System.out.println(resultado1.apply(9.7, 4.1));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.7, 5.1));

        BinaryOperator<Double> mediaFinal = (n1, n2) -> (n1 + n2) / 4;
        System.out.println(mediaFinal.apply(9.8, 4.6));

    }

}
