package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        var resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado1);

        var resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);
    }

    // ANOTAÇÕES //

    // UnaryOperator: cria funções específicas que tem como responsabilidade apenas uma única ação.
    // Funções muito grandes, com muitas responsabilidades são mais dificeis de encontrar soluções de reúso para elas.

    // andThen: faz a operação desde o início.
    // compose - faz a operação de trás para frente.
}
