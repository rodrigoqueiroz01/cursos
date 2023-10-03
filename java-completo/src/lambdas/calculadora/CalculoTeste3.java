package lambdas.calculadora;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        BinaryOperator<Double> calculo = (a, b) -> {
            return a + b;
        };
        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (a, b) -> a * b;
        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (x, y) -> x / y;
        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (a, b) -> a - b;
        System.out.println(calculo.apply(2.0, 3.0));

        BinaryOperator<Integer> calc = (a, b) -> {
            return a + b;
        };
        System.out.println(calc.apply(1, 2));

    }

}
