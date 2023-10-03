package lambdas.calculadora;

public class CalculadoraTeste2 {

    public static void main(String[] args) {

        Calculo calculo;

        // TODO adicao // feito com chaves -> consigo usar mais de uma sentença de código
        calculo = (a, b) -> {
            return a + b;
        };
        System.out.println("Adição: " + calculo.executar(2, 2));

        // TODO subtracao // feito sem chaves. -> // consigo usar apenas uma sentença de código.
        calculo = (a, b) -> a - b;
        System.out.println("Subtração: " + calculo.executar(2, 2));

        // TODO multiplicacao // feito sem chaves.
        calculo = (a, b) -> a * b;
        System.out.println("Multiplicação: " + calculo.executar(2, 2));

        // TODO divisao // feito sem chaves.
        calculo = (a, b) -> a / b;
        System.out.println("Divisão: " + calculo.executar(2, 2));

    }

}
